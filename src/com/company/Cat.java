package com.company;

public class Cat {
    private boolean isFull;
    private int appetit;
    private String name;

    public Cat(int appetit, String name){
        isFull = false;
        this.appetit = appetit;
        this.name = name;
    }
        public void eat(Plate plate){
           if (plate.hasEnoughFoodFor(appetit) && !isFull){
               System.out.println(name + " Кушает.");
               plate.decreaseFood(appetit);
               isFull = true;
           }
           else if (!plate.hasEnoughFoodFor(appetit)){
               System.out.println(name + " Рычит");
           }
           else if (isFull){
               System.out.println("У " + name + " В пузе уже есть еда");
           }

        }
}
