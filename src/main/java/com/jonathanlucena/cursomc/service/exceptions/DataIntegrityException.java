package com.jonathanlucena.cursomc.service.exceptions;

public class DataIntegrityException extends RuntimeException{

    private  static final long serialVerionUID = 1L;

    public DataIntegrityException(String msg){
        super(msg);
    }

    public DataIntegrityException(String msg, Throwable cause){
        super(msg,cause);
    }
}
