package com.quarkus.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

/**
 * @author WangChen
 * @since 2022-06-28 10:42
 **/
@ApplicationScoped
public class BeanLifeStyle {

    private static final Logger logger = LoggerFactory.getLogger(BeanLifeStyle.class);

    //线程安全
    @PostConstruct
    public void init(){
        logger.info("[BeanLifeStyle] init!");
    }

    //线程安全
    @PreDestroy
    public void destroy(){
        logger.info("[BeanLifeStyle] destroy!");
    }
}
