/*package com.java.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class FlywayConditionalInit implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String env=context.getEnvironment().getProperty("spring.db.name");
		return "dev".equals(env);
	}

}
*/