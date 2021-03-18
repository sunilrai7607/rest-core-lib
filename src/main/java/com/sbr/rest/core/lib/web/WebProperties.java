package com.sbr.rest.core.lib.web;

import com.sbr.rest.core.lib.enums.LoggingFormat;
import com.sbr.rest.core.lib.model.BaseModel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@Slf4j
public class WebProperties extends BaseModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebProperties.class);
    @Valid
    @NotNull
    private String group;
    private String landingPath = "/info";

    @PostConstruct
    public void printProperties(final Object... arguments) {
        LOGGER.info(LoggingFormat.PROPERTIES_CONFIG.getFormat(), arguments);
    }
}
