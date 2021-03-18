package com.sbr.rest.core.lib.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Arrays;
import java.util.List;

/**
 * A standard Response structure
 */
@Getter
@Setter
@Slf4j
public class ResponseDTO<T> extends Dto {

    private ResponseStatus responseStatus;

    private T data;

    private List<ErrorDTO> errors;

    public ResponseDTO() {
        //empty constructor
    }

    public ResponseDTO(ResponseStatus responseStatus, T data) {
        this.responseStatus = responseStatus;
        this.data = data;
    }

    public ResponseDTO(ResponseStatus responseStatus, List<ErrorDTO> errors) {
        this.responseStatus = responseStatus;
        this.errors = errors;
    }

    public static <T> ResponseDTO<T> forSuccess(T data) {
        return new ResponseDTO(ResponseStatus.SUCCESS, data);
    }

    public static <T> ResponseDTO<T> forError(ErrorDTO... errorDTO) {
        return new ResponseDTO(ResponseStatus.SUCCESS, Arrays.asList(errorDTO));
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
