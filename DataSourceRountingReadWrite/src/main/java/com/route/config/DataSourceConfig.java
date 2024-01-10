package com.route.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.route.enums.DataSourceType;
import com.route.model.ReadDataSouceProp;
import com.route.model.WriteDataSouceProp;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

	@Autowired
	private ReadDataSouceProp readDataSouceProp;

	@Autowired
	private WriteDataSouceProp writeDataSouceProp;

	@Bean
	public DataSource dataSource() {

		RoutingDataSource routingDataSource = new RoutingDataSource();

		Map<Object, Object> targetDataSource = new HashMap<>();

		targetDataSource.put(DataSourceType.READ, this.readDataSouce());
		targetDataSource.put(DataSourceType.WRITE, this.writeDataSouce());
		routingDataSource.setTargetDataSources(targetDataSource);
		routingDataSource.setDefaultTargetDataSource(this.writeDataSouce());
		return routingDataSource;

	}

	public DataSource readDataSouce() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setJdbcUrl(readDataSouceProp.getUrl());
		dataSource.setUsername(readDataSouceProp.getUsername());
		dataSource.setPassword(readDataSouceProp.getPassword());
		return dataSource;
	}

	public DataSource writeDataSouce() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setJdbcUrl(writeDataSouceProp.getUrl());
		dataSource.setUsername(writeDataSouceProp.getUsername());
		dataSource.setPassword(writeDataSouceProp.getPassword());
		return dataSource;
	}

}
