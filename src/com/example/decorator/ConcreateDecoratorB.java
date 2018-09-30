package com.example.decorator;

public class ConcreateDecoratorB extends Decorator {
    @Override
    void Operation() {
        super.Operation();
        //其他业务操作
        System.out.println("劳资就不做");
    }
}
