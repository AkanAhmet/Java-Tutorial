package com.akanahmet.design_patterns.creational_design_patterns.Singleton_Design;

public class SingletonPattern {

    private static SingletonPattern singleton = null;

    private SingletonPattern(){
        System.out.println("Object Created.");
    }

    public static SingletonPattern getInstance() {

    if(singleton == null) {
       synchronized (SingletonPattern   .class){  // synchronized = 2 threads cannot use this method at the same time !
        if(singleton==null) {
        singleton = new SingletonPattern();} } }
    return singleton;
     }
}
