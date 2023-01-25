package com.example.demo.exception;

public class IndexNonTrouveException extends RuntimeException{
    public IndexNonTrouveException() {
    }

    public IndexNonTrouveException(String message) {
        super(message);
    }
}
