package LabWork04.Part02.Task05;

import java.util.Arrays;

public class Main {

    public static boolean funcBubbleSort(int[] mas) {
        if (mas.length < 2) {
            return false;
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] < mas[j]) {
                    int aj = mas[j];
                    int ai = mas[i];
                    mas[j] = ai;
                    mas[i] = aj;
                }
            }
        }
        return true;
    }

    public static int[] funcMergeSort(int[] mas) {
        if (mas.length < 2) {
            return mas;
        }

        int iMidLen = mas.length / 2;
        int[] masLeft = new int[iMidLen];
        int[] masRight;
        if (mas.length % 2 == 1) {
            masRight = new int[iMidLen + 1];
        } else {
            masRight = new int[iMidLen];
        }

        for (int i = 0; i < masLeft.length; i++) {
            masLeft[i] = mas[i];
        }

        for (int i = 0; i < masRight.length; i++) {
            masRight[i] = mas[i + iMidLen];
        }

        masLeft = funcMergeSort(masLeft);
        masRight = funcMergeSort(masRight);

        return mergeParts(masLeft, masRight);
    }

    private static int[] mergeParts(int[] masLeft, int[] masRight) {
        int[] masRes = new int[masLeft.length + masRight.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < masLeft.length || rightPointer < masRight.length) {
            if (leftPointer < masLeft.length && rightPointer < masRight.length) {
                if (masLeft[leftPointer] < masRight[rightPointer]) {
                    masRes[resultPointer++] = masLeft[leftPointer++];
                } else {
                    masRes[resultPointer++] = masRight[rightPointer++];
                }
            } else if (leftPointer < masLeft.length) {
                masRes[resultPointer++] = masLeft[leftPointer++];
            } else {
                masRes[resultPointer++] = masRight[rightPointer++];
            }
        }

        return masRes;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 6, 10, 2, 3};
        System.out.println("array = " + Arrays.toString(array));

        final int SORTTYPE = 2;
        switch (SORTTYPE) {
            case 1:
                funcBubbleSort(array);
                System.out.println("array was sort: " + Arrays.toString(array));
                break;
            case 2:
                System.out.println("array was sort: " + Arrays.toString(funcMergeSort(array)));
                break;
        }

    }

}