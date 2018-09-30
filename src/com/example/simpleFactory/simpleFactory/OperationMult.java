package com.example.simpleFactory.simpleFactory;

public class OperationMult extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()*getNumB())+"";
    }
}
