package com.quarkus.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

/**
 * @author WangChen
 * @since 2022-06-28 11:08
 **/
@ApplicationScoped
public class RegisterEventListener {

    private static final Logger logger = LoggerFactory.getLogger(RegisterEventListener.class);

    public void onRegisterEvent(@Observes RegisterEvent event){
        logger.info("RegisterEventListener onRegisterEvent exec!");
    }
}
