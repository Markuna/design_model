package com.example.decorator;

public class Decorator extends Compent {
    protected Compent compent;

    public void setCompent(Compent compent){
        this.compent = compent;
    }


    @Override
    void Operation() {
        if(compent != null){
            compent.Operation();
        }
    }
}
