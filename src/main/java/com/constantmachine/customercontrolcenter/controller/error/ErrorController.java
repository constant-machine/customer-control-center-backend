package com.constantmachine.customercontrolcenter.controller.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorBody> handleException(Exception exception) {
        log.error(exception.getMessage());
        var body = new ErrorBody();
        body.setMessage(exception.getMessage());
        return ResponseEntity.internalServerError().body(body);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorBody> handleException(RuntimeException exception) {
        log.error(exception.getMessage());
        var body = new ErrorBody();
        body.setMessage(exception.getMessage());
        return ResponseEntity.internalServerError().body(body);
    }
}
