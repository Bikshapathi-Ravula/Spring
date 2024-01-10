
package com.route.config;

import org.springframework.stereotype.Component;

import com.route.enums.DataSourceType;

@Component
public class DataSourceContextHolder {

	private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<>();

	public static void setDataSourceType(DataSourceType dataSourceType) {

		contextHolder.set(dataSourceType);
	}

	public static DataSourceType getDataSourceType() {
		return contextHolder.get();
	}

	public static void reset() {
		contextHolder.set(DataSourceType.WRITE);
	}
}
