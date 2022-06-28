package com.quarkus.decorator;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author WangChen
 * @since 2022-06-28 10:59
 **/
@ApplicationScoped
public class DefaultUser implements User{
    @Override
    public String say() {
        return "hello!";
    }
}
