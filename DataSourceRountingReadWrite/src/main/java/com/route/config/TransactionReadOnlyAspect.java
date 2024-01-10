package com.route.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.route.enums.DataSourceType;

//@Aspect
@Component
@Order(0)
public class TransactionReadOnlyAspect {

	@Around("@annotation(transactional)")
	public Object proceed(ProceedingJoinPoint proceedingJoinPoint, Transactional transactional) throws Throwable {

		try {
			if (transactional.readOnly()) {
				DataSourceContextHolder.setDataSourceType(DataSourceType.READ);
			}
			return proceedingJoinPoint.proceed();
		} finally {
			DataSourceContextHolder.reset();
		}
	}

}
