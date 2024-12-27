package LabWork04.Part02.Task04;

import java.util.Arrays;

public class Main {

    public static int funcCompare(int[] mas) {
        if (mas.length < 2) {
            return -1;
        }
        boolean isUnique;
        for (int i = 0; i < mas.length; i++) {
            isUnique = true;
            for (int j = 0; j < mas.length; j++) {
                if ((i != j) && (mas[i] == mas[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return mas[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("First unique value is " + funcCompare(array));
    }

}