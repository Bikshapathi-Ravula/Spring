package com.ctel.beanAuditing.config;

import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.data.jpa.domain.support.*;

@EnableJpaAuditing
@Configuration
public class AuditingConfig {
}
