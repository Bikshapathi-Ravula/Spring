
package com.db.mongo.configuration;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.db.mongo.Repo")
public class MongoDbConfiguration extends AbstractMongoClientConfiguration {
	@Value("${spring.data.mongodb.host}")
	private String host;
	@Value("${spring.data.mongodb.port}")
	private int port;

	@Override
	protected String getDatabaseName() {
		return "MongodbTable";
	}

	@Override
	protected void configureClientSettings(MongoClientSettings.Builder builder) {
		builder.applyToClusterSettings(
				settings -> settings.hosts(Arrays.asList(new ServerAddress("localhost", port))));
	}
}
