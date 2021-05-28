package ru.Gorshkova.HomeWorkJava2.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<Integer>> phoneBook = new HashMap<>();
    private List<Integer> number;


    public void add(String fum, Integer num) {
        if(phoneBook.containsKey(fum)) {
            number = phoneBook.get(fum);
            number.add(num);
            phoneBook.put(fum, number);
        } else {
            number = new ArrayList<>();
            number.add(num);
            phoneBook.put(fum, number);
        }
    }

    public List<Integer> get(String fum) {
        return phoneBook.get(fum);
    }
}



















