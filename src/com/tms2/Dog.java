package com.tms2;

public class Dog extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Собака лает.");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Корм")) {
            System.out.println("Собака лючит " + food);
        } else {
            System.out.println("Собака не любит траву");
        }
    }
}


