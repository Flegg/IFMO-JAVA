package com.ifmo.num;

import com.ifmo.exceptions.evilcalc.EvilCalcExceptions;

public enum Operations {
    PLUS, MINUS, DIVIDE, MULTIPLY;

    public int calculate(int one, int two) throws EvilCalcExceptions {
        switch (this) {
            case PLUS:
                return one + two;
            case MINUS:
                return one - two;
            case DIVIDE:
                try {
                    return one / two;
                }
                catch (ArithmeticException e) {
                    throw new EvilCalcExceptions("divide by zero", e);
                }
            case MULTIPLY:
                return one * two;
            default:
                throw new EvilCalcExceptions("something went wrong");
        }
    }
    public static Operations parse(String str) throws EvilCalcExceptions {
        switch (str) {
            case "+":
                return Operations.PLUS;
            case "-":
                return Operations.MINUS;
            case "*":
                return Operations.MULTIPLY;
            case "/":
                return Operations.DIVIDE;
            default:
                throw new EvilCalcExceptions("Unknown operator");
        }
    }

}
