package com.example.simpleFactory.multStaticFactory;

public class OperationDiv extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()/getNumB())+"";
    }
}
