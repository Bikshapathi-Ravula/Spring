package com.amresh;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqttDemoApplication {

	public static void main(String[] args) throws MqttException {
		SpringApplication.run(MqttDemoApplication.class, args);

		System.out.println("A") ;

		String broker = "tcp://10.10.14.249:1883";
		String topic = "myTopic";
		String username = "ctel";
		String password = "cteladmin";
		String clientid = "publish_client";
		String content = "Hello MQTT";
		int qos = 0;

		try {
			MqttClient client = new MqttClient(broker, clientid, new MemoryPersistence());
			MqttConnectOptions options = new MqttConnectOptions();
			options.setUserName(username);
			options.setPassword(password.toCharArray());
			options.setConnectionTimeout(60);
			options.setKeepAliveInterval(60);
			
			// connect
			client.connect(options);
			
			System.out.println("Connected.. steup started");
			
			// create message and setup QoS
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			// publish message
			client.publish(topic, message);
			System.out.println("Message published");
			System.out.println("topic: " + topic);
			System.out.println("message content: " + content);
			// disconnect
			client.disconnect();
			// close client
			client.close();
			

		} catch (MqttException e) {
			throw new RuntimeException(e);
		}

		System.out.println("8");

	}

}
