package org.hieunm.serverfullec2.constants.exception;


import jakarta.servlet.http.HttpServletResponse;

import org.hieunm.serverfullec2.constants.response.ResultData;
import org.hieunm.serverfullec2.constants.response.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public ResultData<Object> handleServiceException(ServiceException e, HttpServletResponse response) {
        response.setStatus(e.getStatusCode());
        return ResultUtil.resultData(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseBody
    public ResultData<Object> handleAccessDeniedException(AccessDeniedException e, HttpServletResponse response) {
        response.setStatus(HttpStatus.FORBIDDEN.value());
        return ResultUtil.resultData(HttpStatus.FORBIDDEN.value(), "Access denied!");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultData<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex, HttpServletResponse response) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        response.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
        return ResultUtil.resultData(HttpStatus.UNPROCESSABLE_ENTITY.value(), "Validation field invalid", errors);
    }

    // Develop
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public ResultData<Object> handleServerErrorException(Exception e, HttpServletResponse response) {
//        e.printStackTrace();
//        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//        return ResultUtil.resultData(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), ExceptionUtils.getStackTrace(e));
//    }

}
