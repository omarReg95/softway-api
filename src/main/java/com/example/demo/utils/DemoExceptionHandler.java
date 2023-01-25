package com.example.demo.utils;

import com.example.demo.exception.IndexNonTrouveException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DemoExceptionHandler {

    @ExceptionHandler(IndexNonTrouveException.class)
    public ResponseEntity<MessageErreur> IndexNonTrouveException(IndexNonTrouveException indexNonTrouveException){
        MessageErreur erreur = new MessageErreur("index-invalide", "l'unité médicale est introuvable.");
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(erreur);
    }
}
