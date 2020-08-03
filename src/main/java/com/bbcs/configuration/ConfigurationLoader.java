package com.bbcs.configuration;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ConfigurationLoader {
    public static Configuration load(InputStream is) {
        var config = new Configuration();
        Yaml yaml = new Yaml();
        Map<String, Object> values = yaml.load(is);
        for (var key : Key.values()) {
            if (values.containsKey(key.name()))
                config.set(key, values.get(key.name()));
        }
        return config;
    }
}
