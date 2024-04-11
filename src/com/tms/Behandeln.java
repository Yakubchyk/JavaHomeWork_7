package com.tms;

// В классе описывается лечение. Наследует класс от Доктора
public class Behandeln extends Doctor {

    class Hirurg extends Doctor {

        @Override
        void behandeln() {
            System.out.println("Хирург. Могу разрезать и зашить.");
        }
    }

    class Therapoid extends Doctor {
        @Override
        void behandeln() {
            System.out.println("Терапевт. Сперва возмите талончик.");
        }
    }

    class Dantist extends Doctor {
        @Override
        void behandeln() {
            System.out.println("Зубной. Работает только по средам.");
        }
    }
}
