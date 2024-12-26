package LabWork04.Part02.Task03;

import java.util.Arrays;

public class Main {

    public static boolean funcCompare(int[] mas) {
        if (mas.length < 2) {
            return false;
        }

        int temp = mas[0];
        mas[0] = mas[mas.length - 1];
        mas[mas.length - 1] = temp;

        return true;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};
        System.out.println("array1 = " + Arrays.toString(array));
        funcCompare(array);
        System.out.println("array2 = " + Arrays.toString(array));
    }

}