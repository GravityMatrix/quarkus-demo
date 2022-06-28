package com.quarkus.event;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * @author WangChen
 * @since 2022-06-28 11:06
 **/
@ApplicationScoped
public class EventPusher {

    @Inject
    Event<RegisterEvent> registerEvent;

    public void fireRegister(){
        registerEvent.fire(new RegisterEvent());
    }
}
