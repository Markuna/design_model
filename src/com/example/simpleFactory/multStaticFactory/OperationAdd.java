package com.example.simpleFactory.multStaticFactory;

public class OperationAdd extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()+getNumB())+"";
    }
}
