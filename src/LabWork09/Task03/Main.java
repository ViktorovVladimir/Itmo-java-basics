package LabWork09.Task03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void setValuesInListsArrays(List<Integer> aList_out, List<Integer> lList_out) {
        for (int i = 0; i < 1000000; i++) {
            Integer iV = i;
            aList_out.add(iV);
            lList_out.add(iV);
        }
    }

    public static void selectRandValues(List<Integer> list, int iterations) {
        Random random = new Random();
        for (int i = 0; i < iterations; i++) {
            int idx = random.nextInt(list.size());
            list.get(idx);
        }
    }

    public static void main(String[] args) {

        List<Integer> aList = new ArrayList<>();
        List<Integer> lList = new LinkedList<>();

        setValuesInListsArrays(aList, lList);

        long startTime = System.nanoTime();
        selectRandValues(aList, 100000);
        long timeArrayList = System.nanoTime() - startTime;
        System.out.println("Time for ArrayList: " + timeArrayList / 1000000 + " ms");

        startTime = System.nanoTime();
        selectRandValues(lList, 100000);
        long timeLinkedList = System.nanoTime() - startTime;
        System.out.println("Time for LinkedList: " + timeLinkedList / 1000000 + " ms");
    }

}
