package com.tms2;

public class Tiger extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Мясо")) {
            System.out.println("Тир любит " + food);
        } else {
            System.out.println("Тигр не ест траву");
        }
    }
}
