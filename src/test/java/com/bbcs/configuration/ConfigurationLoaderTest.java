package com.bbcs.configuration;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConfigurationLoaderTest {
    @Test
    public void loadYamlTest() {
        String configs = "ListeningPort: 1234\nForwardingPort: 12345";
        var config = ConfigurationLoader.load(new ByteArrayInputStream(configs.getBytes()));
        assertNotNull(config);
        assertEquals(1234, config.get(Key.ListeningPort));
        assertEquals(12345, config.get(Key.ForwardingPort));
    }
}
