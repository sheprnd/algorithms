package ru.usetech.tests;

import java.util.Scanner;

//Check is number is prime or not?

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Please, enter a value : ");
        //System.out.print("Enter an int value : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (checkPrime(input)) {
            System.out.println("Input value " + input + " is a prime number.");
        } else {
            System.out.println("Input value " + input
                    + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
