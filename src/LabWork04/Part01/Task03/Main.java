package LabWork04.Part01.Task03;

import java.util.Scanner;

public class Main {

    public static boolean funcCompare(int a, int b, int c) {
        return a + b == c;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int iValue1 = scanner.nextInt();
        System.out.println("Enter second integer:");
        int iValue2 = scanner.nextInt();
        System.out.println("Enter third  integer:");
        int iValue3 = scanner.nextInt();
        System.out.println(funcCompare(iValue1, iValue2, iValue3));

        scanner = null;
    }
}