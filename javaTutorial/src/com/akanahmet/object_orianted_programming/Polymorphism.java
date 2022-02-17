package com.akanahmet.object_orianted_programming;

class Animal{

    private String name;
    public Animal(){}
    public Animal(String name) {
        this.name=name;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void speak() {
        System.out.print(this.getName());
        System.out.println("konuştu");
    }

}

class Bird extends Animal{
    public Bird(String name) {
        super(name);  // veya super.setname(name);
    }

    @Override
    public void speak() {
        System.out.println(super.getName());
        System.out.println("Cik Cik");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println(super.getName());
        System.out.println("Hav Hav");
    }

}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void speak() {
        System.out.println(super.getName());
        System.out.println("Meow");
    }
}

public class Polymorphism {

    public static void speaktry(Animal animal){  // ==> Bu işleri kolaylaştırıyormuş ! Parametre olarak referans alıyor
        animal.speak();
    }
    public static void main(String[] args) {

        Animal an = new Animal("Hayvan");
        Bird b = new Bird("Cibili");
        Dog d = new Dog("Sibirya");
        Cat c = new Cat("Duman");
        b.speak();

        Animal an2 = new Bird("KUŞCUK"); // Referans Farklı, Obje farklı buna POLYMORPHISM deniyor.
        an2.speak();
        speaktry(new Cat("ZIPZIP"));

    }
}
