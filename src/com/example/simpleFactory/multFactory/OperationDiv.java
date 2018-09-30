package com.example.simpleFactory.multFactory;

public class OperationDiv extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()/getNumB())+"";
    }
}
