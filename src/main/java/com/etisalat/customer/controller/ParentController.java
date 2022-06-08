package com.etisalat.customer.controller;

import com.etisalat.customer.dto.common.ResponseGenericDTO;
import com.etisalat.customer.dto.common.ResponseHandler;
import com.etisalat.customer.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class ParentController {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseGenericDTO<?> handleHecException(BusinessException exception){
        log.error(exception.getStackTrace()[0].getClassName());
        log.error("Error occurred in executing method : " + exception.getStackTrace()[0].getMethodName());
        log.error(exception.getMessage(), exception);
        return buildErrorResponse(exception);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseGenericDTO<?> handleRuntimeException(Exception exception){
        log.error(exception.getStackTrace()[0].getClassName());
        log.error("Error occurred in executing method : " + exception.getStackTrace()[0].getMethodName());
        log.error(exception.getMessage(), exception);
        return ResponseHandler.responseSuccessful(new BusinessException("500", "Something went wrong"));
    }

    private ResponseGenericDTO<?> buildErrorResponse(BusinessException exception) {
        log.error(exception.getMessage(), exception);
        return ResponseHandler.responseSuccessful(exception);
    }
}
