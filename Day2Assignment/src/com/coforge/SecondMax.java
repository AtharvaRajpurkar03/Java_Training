package com.coforge;

public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {10, 50, 80, 40, 70};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second Maximum = " + secondMax);
    }
}