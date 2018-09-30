package com.example.simpleFactory.multFactory;

public class OperationSub extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()-getNumB())+"";
    }
}
