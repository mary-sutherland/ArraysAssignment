package com.tts;
import java.util.Arrays;
import java.util.Scanner;


public class sumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put in 5 different numbers: ");

        int arr[] = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            total = total + arr[i];
        }
        System.out.println("The total sum of your numbers is: " + total);
    }
}
