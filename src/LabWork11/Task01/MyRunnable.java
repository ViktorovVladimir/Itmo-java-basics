package LabWork11.Task01;

public class MyRunnable implements Runnable {

    private final int iNumber;

    public MyRunnable(int number) {
        this.iNumber = number;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.println("Thread " + this.iNumber + ": " + i);

            // Печатаем состояние потока во время выполнения
            System.out.println("Thread " + this.iNumber + " during execution state : " + Thread.currentThread().getState());
        }
    }
}
