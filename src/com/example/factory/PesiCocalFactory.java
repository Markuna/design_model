package com.example.factory;

public class PesiCocalFactory implements CocalFactory {
    @Override
    public Cocal createCocal() {
        return new PesiCocal();
    }
}
