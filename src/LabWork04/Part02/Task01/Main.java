package LabWork04.Part02.Task01;

import java.util.Arrays;

public class Main {

    public static boolean funcCompare(int[] mas) {
        if (mas.length < 2) {
            return false;
        }
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i + 1] < mas[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));
        if (funcCompare(array)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
