package com.david.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {
    
    @Override
    public String getMessage() {
        return "A agenda já está cheia.";
    }

}
