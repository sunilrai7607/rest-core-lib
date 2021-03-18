package com.sbr.rest.core.lib.exception;

import com.sbr.rest.core.lib.model.dto.ErrorDTO;
import org.springframework.core.NestedRuntimeException;

import java.util.ArrayList;
import java.util.List;

public class MicroRuntimeException extends NestedRuntimeException {

    private List<ErrorDTO> errors = new ArrayList<>();

    /**
     * Construct a {@code NestedRuntimeException} with the specified detail message.
     *
     * @param msg the detail message
     */
    public MicroRuntimeException(String msg, List<ErrorDTO> errors) {
        super(msg);
        this.errors = errors;
    }

    /**
     * Construct a {@code NestedRuntimeException} with the specified detail message
     * and nested exception.
     *
     * @param msg   the detail message
     * @param cause the nested exception
     */
    public MicroRuntimeException(String msg, Throwable cause, List<ErrorDTO> errors) {
        super(msg, cause);
        this.errors = errors;
    }
}
