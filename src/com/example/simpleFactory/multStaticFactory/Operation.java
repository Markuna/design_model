package com.example.simpleFactory.multStaticFactory;

public class Operation {
    private String numberA;
    private String numberB;

    private double numA = 0;
    private double numB = 0;


    public void setNumberA(String numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(String numberB) {
        this.numberB = numberB;
    }

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    protected void handler(){
        if(numberA.matches("^\\d+(\\.\\d+)?$") && numberB.matches("^\\d+(\\.\\d+)?$")){
            this.numA = Double.valueOf(numberA);
            this.numB = Double.valueOf(numberB);
        }else{
            System.out.println("输入不合法");
        }
    }

    public String getResult(){
        return "未知计算方式";
    };

}
