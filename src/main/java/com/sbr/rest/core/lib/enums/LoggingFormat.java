package com.sbr.rest.core.lib.enums;

import lombok.Getter;

@Getter
public enum LoggingFormat {

    PROPERTIES_CONFIG("== Properties Class: '{}'; Configuration Properties: {} ");

    private final String format;

    LoggingFormat(String format) {
        this.format = format;
    }
}
