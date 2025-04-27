package com.example.CricBuzz.Exception;

public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException(String mess) {
        super(mess);
    }


}
