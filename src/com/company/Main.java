package com.company;

public class Main {

    public static void main(String[] args) {
        Cat [] cats = {
                new Cat (5, "Marfa"),
                new Cat (7,"Masha"),
                new Cat (10, "Tiger")
        };
        Plate plate = new Plate(20);
        for (Cat cat : cats)
        {
            cat.eat (plate);}
        plate.increaseFood(50);
        for(Cat cat: cats){
            cat.eat(plate);
        }

    }
}

