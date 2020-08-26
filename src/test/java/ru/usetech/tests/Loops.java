package ru.usetech.tests;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){


        /*for (int j = 0; j <= 4; j++) {
            System.out.println("Число j = " + j);
        }*/

        Scanner scanner = new Scanner(System.in);

        for (; true; )
        {
            String s = scanner.nextLine();
            if (s.equals("exit")){

                System.out.println("Вы вышли из программы");
            }

                break;
        }
    }
}
