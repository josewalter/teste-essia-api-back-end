package com.testessiaapi.exception;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class JaylineFashionExceptionHandler extends ResponseEntityExceptionHandler {

     @Autowired
     private MessageSource messageSource;


    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        String clienteMessage =  messageSource.getMessage("mensagem.invalida", null, LocaleContextHolder.getLocale());
        String developerMessage =  ex.getCause().toString();
        List<Erro> error = Arrays.asList(new Erro(clienteMessage, developerMessage));
        return handleExceptionInternal(ex, error, headers, HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        List<Erro> error = criarListError(ex.getBindingResult());
        return  handleExceptionInternal(ex, error, headers, HttpStatus.BAD_REQUEST, request);
    }

    private List<Erro> criarListError(BindingResult bindingResult){
         List<Erro> errorList = new ArrayList<>();

         for (FieldError fieldError : bindingResult.getFieldErrors()) {
             String clienteMessage = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
             String developerMessage = fieldError.toString();
             errorList.add(new Erro(clienteMessage, developerMessage));
         }

         return errorList;
    }

    public static class Erro {
         @Getter
         private String clienteMessage;
         @Getter
         private String developerMessage;

         public  Erro(String clienteMessage, String developerMessage){
             this.clienteMessage=clienteMessage;
             this.developerMessage=developerMessage;
         }

         public String getClienteMessage(){
             return null;
         }

    }
}
