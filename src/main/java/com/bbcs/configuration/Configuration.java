package com.bbcs.configuration;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    Map<Key, Object> properties = new HashMap<>();

    public Configuration() {
        for (var key : Key.values()) {
            properties.put(key, key.getDefaultValue());
        }
    }

    public Object get(Key key) {
        return properties.get(key);
    }

    public void set(Key key, Object value) {
        properties.put(key, value);
    }
}
