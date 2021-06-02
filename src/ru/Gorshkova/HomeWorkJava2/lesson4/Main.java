package ru.Gorshkova.HomeWorkJava2.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Один", "Два", "Три", "Три", "Четыре", "Пять", "Пять", "Шесть", "Семь", "Семь");

        Set<String> unique = new LinkedHashSet<>(words);

        System.out.println("Список");
        System.out.println(words.toString());
        System.out.println("Список уникальных слов");
        System.out.println(unique.toString());
        System.out.println("Сколько раз встречаются слова:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        // Справочник
        System.out.println("\nСправочник\n");

            PhoneBook phoneBook = new PhoneBook();

            phoneBook.add("Иванов", 11111);
            phoneBook.add("Петров", 22222);
            phoneBook.add("Иванов", 33333);
            phoneBook.add("Сидоров", 44444);
            phoneBook.add("Копытов", 55555);

            System.out.println(phoneBook.get("Иванов"));
            System.out.println(phoneBook.get("Петров"));
            System.out.println(phoneBook.get("Сидоров"));
            System.out.println(phoneBook.get("Копытов"));

    }
}
