package LabWork04.Part01.Task02;


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Divided by 3: " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Divided by 5: " + i);
            }
            if (i % 15 == 0) {
                System.out.println("Divisible by 3 and 5: " + i);
            }
        }
    }
}