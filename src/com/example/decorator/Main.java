package com.example.decorator;

public class Main {
    /**
     * 装饰模式
     *
     * @param args
     */
    public static void main(String[] args) {
        ConcreateCompent concreateCompent = new ConcreateCompent();
        ConcreateDecoratorA concreateDecoratorA = new ConcreateDecoratorA();
        ConcreateDecoratorB concreateDecoratorB = new ConcreateDecoratorB();

        concreateDecoratorA.setCompent(concreateCompent);
        concreateDecoratorB.setCompent(concreateDecoratorA);

        concreateDecoratorB.Operation();
    }
}
