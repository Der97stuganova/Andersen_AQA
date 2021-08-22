package hw8.task1;

import java.util.*;

public class Array {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Казань", "Мурманск", "Чебоксары", "Москва", "Казань",
                "Владивосток", "Новосибирск", "Казань", "Москва", "Сочи",
                "Сочи", "Екатеринбург", "Чебоксары", "Челябинск", "Мурманск",
                "Казань", "Казань", "Чебоксары", "Новосибирск", "Чебоксары"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Список уникальных слов");
        System.out.println(unique.toString());
        System.out.println("Подсчет встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}