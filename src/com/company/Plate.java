package com.company;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood( int appetit){
        if(!hasEnoughFoodFor(appetit)){
            System.out.println("Еды в тарелке меньше, чем аппетита у кошки");}
        else{
        food = food - appetit;
        }
    }
    public boolean hasEnoughFoodFor(int appetit){
        return appetit < food;
    }
    public void increaseFood(int countOfFood){
food += countOfFood;
    }
}
