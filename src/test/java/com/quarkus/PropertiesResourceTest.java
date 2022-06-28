package com.quarkus;

import com.quarkus.properties.PropertyGroupConfig;
import com.quarkus.properties.PropertyValueConfig;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class PropertiesResourceTest {

    @Inject
    PropertyGroupConfig propertyGroupConfig;

    @Inject
    PropertyValueConfig propertyValueConfig;

    @Test
    public void testPropertyGroupConfig() {
        String name = propertyGroupConfig.name();
        Integer age = propertyGroupConfig.age();
        Assertions.assertEquals(name, "greetingGroupName");
        Assertions.assertEquals(age, 10);
    }

    @Test
    public void testPropertyValueConfig() {
        String name = propertyValueConfig.name();
        Integer age = propertyValueConfig.age();
        String emptyValue = propertyValueConfig.emptyValue();
        Assertions.assertEquals(name, "greetingGroupName");
        Assertions.assertEquals(age, 10);
        Assertions.assertEquals(emptyValue, "emptyValue");
    }

    @Test
    public void testConfigProvider() {
        Assertions.assertEquals(ConfigProvider.getConfig().getConfigValue("greeting.group.name").getValue(), "greetingGroupName");
        Assertions.assertEquals(ConfigProvider.getConfig().getConfigValue("greeting.group.age").getValue(), "10");
        Assertions.assertEquals(ConfigProvider.getConfig().getConfigValue("greeting.group.value").getValue(), null);
    }

}