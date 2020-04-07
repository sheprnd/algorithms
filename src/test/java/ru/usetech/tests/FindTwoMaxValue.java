package ru.usetech.tests;

public class FindTwoMaxValue {
    public void GetTwoMaxValues(int[] nums) {

        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }

        }

        System.out.println("Max1 - " + maxOne);
        System.out.println("Max2 - " + maxTwo);
    }

    public static void main(String[] args) {

        int list[] = { 145, 224, 348, 221, 143, 121, 179, 93 };

        FindTwoMaxValue max = new FindTwoMaxValue();
        max.GetTwoMaxValues(list);
    }
}