package ru.Gorshkova.HomeWorkJava2.lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruitL = new ArrayList<>();

    public void add(T fruit){
        fruitL.add(fruit);
    }

    public float getWeight(){
        float count = fruitL.size();
        if(count == 0f)
            return 0;
            return fruitL.get(0).getWeigth()*count;
    }
    public boolean compare(Box box){
        return this.getWeight()==box.getWeight();
    }
    public void transfer(Box<T> Box){
        for (T fruit : fruitL){
            Box.add(fruit);
        }
        fruitL.clear();
    }




}
