package ru.usetech.tests;

import java.util.HashSet;
import java.util.Set;


public class IteratorExampleSet {


    public static void main(String[] args)
    {
        Set<java.lang.String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

/*
        //получение итератора для множества
        Iterator<String> iterator = set.iterator();


        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
*/
        for (String text : set){
            System.out.println(text);
        }
    }
}