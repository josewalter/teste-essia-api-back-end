package com.testessiaapi.exception;

public class EntityInUseException extends Throwable {

    private static final long serialVersionUID = 1L;

    public EntityInUseException(String mensagem) {
        super(mensagem);
    }
}
