package com.example.simpleFactory.simpleFactory;

public class OperationDiv extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()/getNumB())+"";
    }
}
