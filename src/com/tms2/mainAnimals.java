package com.tms2;

public class mainAnimals {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Трава");
        rabbit.eat("Мясо");
        System.out.println(" ");

        Dog dog = new Dog();
        dog.voice();
        dog.eat("Корм");
        dog.eat("Трава");
        dog.eat("Мясо");
        System.out.println(" ");

        Tiger tiger = new Tiger();
        tiger.voice();
        tiger.eat("Мясо");
        tiger.eat("Трава");
        tiger.eat("Корм");
        System.out.println(" ");
    }
}