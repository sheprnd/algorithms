package ru.usetech.tests;


/*
Here is an problem needs to resolve

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].*/

public class ArraysActions {

    public static void main(String[] args) {


            int n = 100;
            int i=0, j = 0;
            int nums[] = new int[n];
            while (i <= (n-1)){
                nums[i] = ++j;
                System.out.println("Array's element #" + (i + 1) + " = " + nums[i]);
                ++i;

            }


    }



    }

