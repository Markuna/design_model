package com.example.simpleFactory.multFactory;

public class OperationAdd extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()+getNumB())+"";
    }
}
