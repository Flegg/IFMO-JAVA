package com.ifmo.exceptions.evilcalc;

public class EvilCalcExceptions extends Exception{
    public EvilCalcExceptions(String message) {
        super(message);
    }

    public EvilCalcExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
