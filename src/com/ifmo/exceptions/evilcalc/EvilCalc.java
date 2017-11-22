package com.ifmo.exceptions.evilcalc;

import com.ifmo.num.Operations;

public class EvilCalc {
    private int x;
    private int y;
    Operations operations;

    public void calculate(String decree) throws EvilCalcExceptions {
        String[] decrees = decree.split(" ");
        if (decrees.length != 3){
            throw new EvilCalcExceptions("Unknown decree");
        }
        // TODO: 22.11.2017  
    }


}
