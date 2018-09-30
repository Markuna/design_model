package com.example.simpleFactory.multStaticFactory;

public class OperationFactory {
    public static Operation getAddOperation(){
        return new OperationAdd();
    }
    public static Operation getSubOperation(){
        return new OperationSub();
    }
    public static Operation getMultOperation(){
        return new OperationMult();
    }
    public static Operation getDivOperation(){
        return new OperationDiv();
    }

}
