package com.example.simpleFactory.multStaticFactory;

public class Main {
    /**
     * 多静态方法简单工厂模式
     * 工厂类调用不同方法返回具体实现类
     * @param args
     */
    public static void main(String[] args) {
        Operation op = OperationFactory.getDivOperation();
        op.setNumberA("13.0");
        op.setNumberB("3");
        System.out.println(op.getResult());
    }
}
