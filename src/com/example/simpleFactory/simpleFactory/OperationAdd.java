package com.example.simpleFactory.simpleFactory;

public class OperationAdd extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()+getNumB())+"";
    }
}
