package com.bbcs.configuration;

public enum Key {
    ListeningPort(0), ForwardingPort(0);

    private final Object defaultValue;

    Key(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public static Key parseKey(String keyName) {
        for (var k : values()) {
            if (k.name().equals(keyName))
                return k;
        }
        return null;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }
}
