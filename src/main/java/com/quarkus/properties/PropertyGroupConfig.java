package com.quarkus.properties;

import io.smallrye.config.ConfigMapping;

import javax.validation.constraints.Max;

/**
 *
 * 这个是第三方库
 * @link https://github.com/smallrye/smallrye-config
 *
 * 功能类似于Springboot中的@ConfigurationProperties(prefix = "xxxx")
 *
 * @author WangChen
 * @since 2022-06-23 09:48
 **/
@ConfigMapping(prefix = "greeting.group")
public interface PropertyGroupConfig {


    String name();

    /**
     * 验证属性
     */
    @Max(value = 25, message = "年龄最大为25")
    Integer age();

}
