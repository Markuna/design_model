package com.example.simpleFactory.multFactory;

public class OperationFactory {
    public Operation getAddOperation(){
        return new OperationAdd();
    }
    public Operation getSubOperation(){
        return new OperationSub();
    }
    public Operation getMultOperation(){
        return new OperationMult();
    }
    public Operation getDivOperation(){
        return new OperationDiv();
    }

}
