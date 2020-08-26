package ru.usetech.tests;

import java.util.ArrayList;
import java.util.List;


public class IteratorExampleList {


    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

/*        //получение итератора для множества
        Iterator<String> iterator = list.iterator();


        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }*/

        for (String text : list){
            System.out.println(text);
        }
    }
}