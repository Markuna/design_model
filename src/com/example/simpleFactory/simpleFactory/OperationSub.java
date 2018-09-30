package com.example.simpleFactory.simpleFactory;

public class OperationSub extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()-getNumB())+"";
    }
}
