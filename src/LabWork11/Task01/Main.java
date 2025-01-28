package LabWork11.Task01;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            System.out.println("Thread " + i + " before start, state : " + thread.getState());
            thread.start();
            System.out.println("Thread " + i + " after start, state : " + thread.getState());
        }
    }
}
