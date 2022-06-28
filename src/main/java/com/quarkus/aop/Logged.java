package com.quarkus.aop;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author WangChen
 * @since 2022-06-28 10:47
 **/
@InterceptorBinding // this makes it an interceptor binding annotation
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Inherited
public @interface Logged {
}
