package com.coforge;

public class PrimeArray {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 8, 11, 15, 17};

        System.out.println("Prime numbers:");

        for (int num : arr) {
            if (isPrime(num))
                System.out.println(num);
        }
    }
}