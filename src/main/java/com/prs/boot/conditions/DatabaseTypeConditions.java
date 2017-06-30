package com.prs.boot.conditions;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.prs.boot.annotation.DatabaseType;

public class DatabaseTypeConditions implements Condition {

	@Override
	public boolean matches(ConditionContext ctxt, AnnotatedTypeMetadata metadata) {
		Map<String,Object> map = metadata.getAnnotationAttributes(DatabaseType.class.getName());
		String type = (String)map.get("value");
		String enabledDbType = System.getProperty("dbType");
		return enabledDbType!=null && type!=null && type.equalsIgnoreCase(enabledDbType);
	}

}
