package LabWork04.Part01.Task05;

import java.util.Arrays;

public class Main {

    public static boolean funcCompare(int[] mas) {
        if (mas.length < 2) {
            return false;
        }
        return (mas[0] == 3) || (mas[mas.length - 1] == 3);
    }

    public static void main(String[] args) {
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(funcCompare(array));
    }

}