package com.example.simpleFactory.multFactory;

public class OperationMult extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()*getNumB())+"";
    }
}
