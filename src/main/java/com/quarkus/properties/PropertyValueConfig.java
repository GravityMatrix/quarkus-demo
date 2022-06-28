package com.quarkus.properties;

import lombok.Data;
import lombok.experimental.Accessors;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Singleton;

/**
 * <p>
 * 功能类似于Springboot中的@Value
 *
 * @author WangChen
 * @since 2022-06-23 09:48
 **/
@Accessors(fluent = true, chain = true)
@Data
@Singleton
public class PropertyValueConfig {

    @ConfigProperty(name = "greeting.group.name")
    String name;

    @ConfigProperty(name = "greeting.group.age")
    Integer age;

    @ConfigProperty(name = "greeting.group.value", defaultValue = "emptyValue")
    String emptyValue;

}
