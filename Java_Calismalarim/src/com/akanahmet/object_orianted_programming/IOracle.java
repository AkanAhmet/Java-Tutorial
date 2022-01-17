package com.akanahmet.object_orianted_programming;

class IOracle implements IDatabase{

    @Override
    public void log() {
        //
    }

    @Override
    public void add() {
        System.out.println(" Oracle ekleme");
    }

    @Override
    public void get() {
        System.out.println("Oracle sorgulama");
    }

    @Override
    public void update() {
        System.out.println("Oracle güncelleme");
    }

    @Override
    public void delete() {
        System.out.println("Oracle silme");
    }

}