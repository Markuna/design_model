package com.example.factory;

public class CocalCocalFactory implements CocalFactory {
    @Override
    public Cocal createCocal() {
        return new CocaCocal();
    }
}
