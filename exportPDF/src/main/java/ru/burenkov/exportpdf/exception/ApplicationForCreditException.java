package ru.burenkov.exportpdf.exception;

public class ApplicationForCreditException extends RuntimeException{
    public ApplicationForCreditException (String message){
        super(message);
    }
    public ApplicationForCreditException (String message, Throwable cause){
        super(message,cause);
    }
}
