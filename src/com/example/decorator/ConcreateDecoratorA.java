package com.example.decorator;

public class ConcreateDecoratorA extends Decorator {
    @Override
    void Operation() {
        super.Operation();
        //其他业务操作
        System.out.println("摆腿，收椅，坐下");
    }
}
