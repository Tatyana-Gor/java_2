package ru.Gorshkova.HomeWorkJava2.lesson2;

public class MyArrayDataException extends Exception{
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }


}
