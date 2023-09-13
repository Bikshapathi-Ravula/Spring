
package com.test.config;

import static io.debezium.data.Envelope.FieldName.AFTER;
import static io.debezium.data.Envelope.FieldName.BEFORE;
import static io.debezium.data.Envelope.FieldName.OPERATION;
import static java.util.stream.Collectors.toMap;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.kafka.connect.data.Field;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.source.SourceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.service.KafkaProducerService;
import io.debezium.config.Configuration;
import io.debezium.data.Envelope.Operation;
import io.debezium.embedded.Connect;
import io.debezium.engine.DebeziumEngine;
import io.debezium.engine.RecordChangeEvent;
import io.debezium.engine.format.ChangeEventFormat;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DebeziumListener {

	@SuppressWarnings("unused")
	@Autowired
	private KafkaProducerService kafkaProducerService;

	private final Executor executor = Executors.newSingleThreadExecutor();

	private final DebeziumEngine<RecordChangeEvent<SourceRecord>> debeziumEngine;

	/**
	 * This is a Listener to capture the data changes in db
	 * 
	 * @param customerConnectorConfiguration
	 */
	public DebeziumListener(Configuration customerConnectorConfiguration) {
		this.debeziumEngine = DebeziumEngine.create(ChangeEventFormat.of(Connect.class))
				.using(customerConnectorConfiguration.asProperties()).notifying(t -> {
					try {
						this.handleChangeEvent(t);
					} catch (JsonGenerationException e) {

						e.printStackTrace();
					} catch (JsonProcessingException e) {

						e.printStackTrace();
					}
				}).build();
	}

	/**
	 * This is used to handle the captured changes in database
	 * 
	 * @param sourceRecordRecordChangeEvent
	 * @throws JsonGenerationException
	 * @throws JsonProcessingException
	 */
	private void handleChangeEvent(RecordChangeEvent<SourceRecord> sourceRecordRecordChangeEvent)
			throws JsonGenerationException, JsonProcessingException {

		SourceRecord sourceRecord = sourceRecordRecordChangeEvent.record();

		System.out.println("Key :" + sourceRecord.key());

		Struct sourceRecordChangeValue = (Struct) sourceRecord.value();

		System.out.println("Value :" + sourceRecord.value());

		if (sourceRecordChangeValue != null) {
			Operation operation = Operation.forCode((String) sourceRecordChangeValue.get(OPERATION));

			System.out.println("Operation:" + operation);

			if (operation != Operation.READ) {
				// Handling Update & Insert operations.
				String record = operation == Operation.DELETE ? BEFORE : AFTER;

				Struct struct = (Struct) sourceRecordChangeValue.get(record);
				Map<String, Object> payload = struct.schema().fields().stream()
						.map(Field::name)
						.filter(fieldName -> struct.get(fieldName) != null)
						.map(fieldName -> Pair.of(fieldName, struct.get(fieldName)))
						.collect(toMap(Pair::getKey, Pair::getValue));

				System.out.println("Payload:" + payload);
			}
		}

	}

	@PostConstruct
	private void start() {
		this.executor.execute(debeziumEngine);
	}

	@PreDestroy
	private void stop() throws IOException {
		if (Objects.nonNull(this.debeziumEngine)) {
			this.debeziumEngine.close();
		}
	}
}
