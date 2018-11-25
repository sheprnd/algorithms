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
    public static void main (String args[]){
        arraySringOrInt("string", 10);
        arraySringOrInt("integer", 15);
        arraySringOrInt("string1", 1000);

        Box catBox = new Box();
        catBox.setDim(400, 200, 250);
        int vol = catBox.getVolume();

        System.out.println("Объём ящика: " + vol);

    }


    public static void arraySringOrInt(String arraytype, int n) {
        int i = 0;
        String[] m = new String[n];
        int[] nums = new int[n];

        if (arraytype == "integer") {
            while (i < n) {
                nums[i] = i;
                System.out.println("Array's element #" + (i + 1) + " = " + (nums[i] + 1));
                ++i;
            }
        } else if (arraytype == "string") {
            while (i < n) {
                m[i] = "Array's element #" + (i + 1) + " = String " + "#" + (i + 1);
                System.out.println(m[i]);
                ++i;
            }
        } else {
            System.out.println("Unrecognized array type");
        }

    }
}