package com.example.simpleFactory.simpleFactory;

public class Main {
    /**
     * 简单工厂模式
     * 工厂类按照输入获取同一接口的指定实现类
     * @param args
     */
    public static void main(String[] args) {
        Operation op = OperationFactory.getInstance("/");
        op.setNumberA("10.0");
        op.setNumberB("3");
        System.out.println(op.getResult());
    }
}
