package com.example.simpleFactory.multFactory;

public class Main {
    /**
     * 多方法简单工厂模式
     * 工厂类调用不同方法返回具体实现类
     * @param args
     */
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationFactory();
        Operation op = operationFactory.getDivOperation();
        op.setNumberA("20.0");
        op.setNumberB("3");
        System.out.println(op.getResult());
    }
}
