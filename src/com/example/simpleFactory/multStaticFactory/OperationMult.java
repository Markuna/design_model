package com.example.simpleFactory.multStaticFactory;

public class OperationMult extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()*getNumB())+"";
    }
}
