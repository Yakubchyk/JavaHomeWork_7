package com.tms2;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Кролики пищат, наверное.");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Трава")) {
            System.out.println("Кролик лючит траву.");
        } else {
            System.out.println("Кролик не в восторге от " + food);
        }
    }

}
