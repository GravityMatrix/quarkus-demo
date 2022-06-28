package com.quarkus.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author WangChen
 * @since 2022-06-28 10:45
 **/
@Logged
@Interceptor
public class LoggingInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @AroundInvoke
    public Object logInvocation(InvocationContext context) throws Exception {
        // ...log before
        logger.info("[LoggingInterceptor] logger before");
        Object ret = context.proceed();
        logger.info("[LoggingInterceptor] logger after");
        // ...log after
        return ret;
    }

}
