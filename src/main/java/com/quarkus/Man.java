package com.quarkus;

import javax.inject.Singleton;

/**
 * @author WangChen
 * @since 2022-06-22 11:28
 **/
@Singleton
public class Man implements Say {
    @Override
    public void say() {
        System.out.println("man!");
    }
}
