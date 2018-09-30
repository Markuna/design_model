package com.example.factory;

public class Main {
    /**
     * 对比简单工厂模式，是多了将工厂也进行接口化
     * 这样扩展就不需要对工厂类进行修改了
     * 直接以继承的方式横向扩展
     * 符合开放封闭原则
     * @param args
     */
    public static void main(String[] args) {
        CocalFactory cocalFactory = new CocalCocalFactory();
        Cocal cocal = cocalFactory.createCocal();
        cocal.drink();

        cocalFactory = new PesiCocalFactory();
        cocal = cocalFactory.createCocal();
        cocal.drink();
    }
}
