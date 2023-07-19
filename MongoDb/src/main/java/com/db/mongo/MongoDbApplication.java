package com.db.mongo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.db.mongo.repo.Repo;
@EnableMongoRepositories(basePackageClasses = Repo.class)
*/@SpringBootApplication
public class MongoDbApplication {
	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}
}
