package com.quarkus.demo;

import javax.inject.Singleton;

/**
 * @author WangChen
 * @since 2022-06-22 11:41
 **/
@Singleton
public class Woman2 implements Say{
    @Override
    public void say() {
        System.out.println("111111111111111");
    }
}
