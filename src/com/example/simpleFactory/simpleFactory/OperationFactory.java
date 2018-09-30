package com.example.simpleFactory.simpleFactory;

public class OperationFactory {
    public static Operation getInstance(String operator){
        switch (operator){
            case "+":
                return new OperationAdd();
            case  "-":
                return new OperationSub();
            case "*":
                return new OperationMult();
            case "/":
                return new OperationDiv();
            default:
                return new Operation();

        }
    }

}
