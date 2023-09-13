package com.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class DebeziumConfig {

	@Value("${resource.datasource.host}")
	private String resourcedbHost;

	@Value("${resource.datasource.port}")
	private String resourcedbPort;

	@Value("${resource.datasource.database}")
	private String resourcedbName;

	@Value("${resource.datasource.username}")
	private String resourcedbUserName;

	@Value("${resource.datasource.password}")
	private String resourcedbPassword;

	/**
	 * Configuring the resource database with debezium
	 * 
	 * @return
	 */
	@Bean
	public io.debezium.config.Configuration customerConnector() {

		return io.debezium.config.Configuration.create()
				.with("name", "customer-mysql-connector")// connector name
				.with("connector.class", "io.debezium.connector.mysql.MySqlConnector")
				.with("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore")
				.with("offset.storage.file.filename", "/tmp/offsets.dat")
				.with("offset.flush.interval.ms", "60000")
				.with("database.hostname", resourcedbHost)// resource db host
				.with("database.port", resourcedbPort)// resource db port
				.with("database.user", resourcedbUserName)// resource db username
				.with("database.password", resourcedbPassword)// resource db password
				.with("database.dbname", resourcedbName)// resource db name
				.with("database.include.list", resourcedbName)
				.with("include.schema.changes", "false")
				.with("database.server.id", "10181")
				.with("database.server.name", "customer-mysql-db-server")
				.with("database.history", "io.debezium.relational.history.FileDatabaseHistory")
				.with("database.history.file.filename", "/tmp/dbhistory.dat").build();
	}
}
