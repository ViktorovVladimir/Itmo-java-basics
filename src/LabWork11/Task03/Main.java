package LabWork11.Task03;

public class Main {


    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();

        final int NUM = 10;

        Runnable runnable1 = new Runnable() {
            public void run() {
                for (int i = 0; i < NUM; i++) {
                    counter.method1();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            public void run() {
                for (int i = 0; i < NUM; i++) {
                    counter.method2();
                }
            }
        };

        //--.
        thread1 = new Thread(runnable1);
        thread1.start();
        thread2 = new Thread(runnable2);
        thread2.start();


    }

}
