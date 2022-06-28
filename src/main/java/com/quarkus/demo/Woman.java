package com.quarkus.demo;

import javax.inject.Singleton;

/**
 * @author WangChen
 * @since 2022-06-22 11:29
 **/
@Singleton
public class Woman implements Say {
    @Override
    public void say() {
        System.out.println("woman");
    }
}
