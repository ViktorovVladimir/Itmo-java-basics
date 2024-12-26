package LabWork04.Part02.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int iArrayLen = scanner.nextInt();
        int[] mas = new int[iArrayLen];
        System.out.println("Enter numbers of array:");
        for (int i = 0; i < iArrayLen; i++) {
            mas[i] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(mas));

        mas = null;
    }

}