package com.quarkus.decorator;

import com.quarkus.aop.Logged;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

/**
 * @author WangChen
 * @since 2022-06-28 11:00
 **/
@Decorator
public class DecoratorUser implements User{

    @Inject
    @Delegate
    User userDelegate;

    @Logged
    @Override
    public String say() {
        String say = userDelegate.say();
        return say + "decorator!";
    }
}
