package com.example.simpleFactory.multStaticFactory;

public class OperationSub extends Operation {
    @Override
    public String getResult() {
        super.handler();
        return (getNumA()-getNumB())+"";
    }
}
