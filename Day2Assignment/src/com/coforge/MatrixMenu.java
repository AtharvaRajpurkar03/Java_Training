package com.coforge;

import java.util.Scanner;

public class MatrixMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] C = new int[2][2];

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        C[i][j] = A[i][j] + B[i][j];
                break;

            case 2:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        C[i][j] = A[i][j] - B[i][j];
                break;

            case 3:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = 0;

                        for (int k = 0; k < 2; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
                break;
        }

        System.out.println("Result:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}