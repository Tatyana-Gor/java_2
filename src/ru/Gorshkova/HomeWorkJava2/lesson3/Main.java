package ru.Gorshkova.HomeWorkJava2.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача №1
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        swapElement(arr, 1, 2);
        System.out.println(Arrays.toString(arr));



        // Задача №2
        System.out.println("\n");

       Box<Apple> appleBox = new Box<>();
       Box<Apple> appleBox2 = new Box<>();
       Box<Orange> orangeBox = new Box<>();

       for (float i = 0; i < 5; i++){
           appleBox.add(new Apple());
           orangeBox.add(new Orange());
       }


        System.out.println("Коробка с яблоками весит " + appleBox.getWeight());
        System.out.println("Коробка с апельсинами весит " + orangeBox.getWeight());


        System.out.println("Сравнение: " + appleBox.compare(orangeBox));

        System.out.println("Пересыпаем ");
        appleBox2.transfer(appleBox);
        System.out.println("Первая коробка с яблоками теперь весит " + appleBox.getWeight());
        System.out.println("Новая коробка с яблоками теперь весит " + appleBox2.getWeight());

    }



    static void swapElement(Integer[] arr, int i, int i1) {
        int a = arr[i];
        arr[i] = arr [i1];
        arr[i1] = a;

    }
}
