package LabWork11.Task01;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (i < 10) {
            System.out.println("My thread is running " + Thread.currentThread().getName());
            i++;
        }
    }
}
