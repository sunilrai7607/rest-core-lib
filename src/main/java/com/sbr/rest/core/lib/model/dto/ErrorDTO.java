package com.sbr.rest.core.lib.model.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * ErrorDTO response
 */

@Data
@Slf4j
public class ErrorDTO extends Dto {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private String code;

    private String message;

}
