package com.bbcs.configuration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConfigurationTest {
    @Test
    public void shouldReadDefaultValueWhenConfigurationValueNotSet() {
        Configuration configuration = new Configuration();
        for (var key : Key.values()) {
            Object value = configuration.get(key);
            assertNotNull(value);
            assertEquals(key.getDefaultValue(), value);
        }
    }

    @Test
    public void configurationKeyValidTest() {
        String[] keyNames = {"ListeningPort", "ForwardingPort"};
        for (var keyName : keyNames) {
            assertNotNull(Key.parseKey(keyName));
        }
    }

    @Test
    public void shouldReturnSameValueAfterSetProperty() {
        Configuration configuration = new Configuration();
        configuration.set(Key.ListeningPort, "1234");
        assertEquals(configuration.get(Key.ListeningPort), "1234");
    }
}
