package com.prs.boot.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Conditional;

import com.prs.boot.conditions.DatabaseTypeConditions;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Conditional(DatabaseTypeConditions.class)
public @interface DatabaseType {

	String value();
}
