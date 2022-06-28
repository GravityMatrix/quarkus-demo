package com.quarkus.applifestyle;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

/**
 * @author WangChen
 * @since 2022-06-28 10:00
 **/
@ApplicationScoped
public class AppLifeStyle {

    private static final Logger logger = LoggerFactory.getLogger(AppLifeStyle.class);

    public void onStart(@Observes StartupEvent startupEvent){
        logger.info("[AppLifeStyle] onStart {}", startupEvent.toString());
    }


    public void onStop(@Observes ShutdownEvent shutdownEvent){
        logger.info("[AppLifeStyle] Shutdown {}", shutdownEvent.toString());
    }
}
