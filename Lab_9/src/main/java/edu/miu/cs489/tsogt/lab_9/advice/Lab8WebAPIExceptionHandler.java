package edu.miu.cs489.tsogt.lab_9.advice;

import edu.miu.cs489.tsogt.lab_9.exception.PatientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class Lab8WebAPIExceptionHandler {

    @ExceptionHandler(PatientNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handlePublisherNotFoundException(PatientNotFoundException patientNotFoundException) {
        Map<String, String> errorMessageMap = new HashMap<>();
        errorMessageMap.put("errorMessage", patientNotFoundException.getMessage());
        return errorMessageMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BadCredentialsException.class)
    public Map<String, String> handleUserAuthBadCredentialException(BadCredentialsException bcEx) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", bcEx.getMessage());
        errorMap.put("errorDisplayText", "Invalid Username and/or Password!");
        return errorMap;
    }
}
