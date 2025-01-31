package LabWork11.Task02;

import LabWork11.Task01.MyRunnable;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {

            Runnable runnable = new Runnable() {
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            };

            threads[i] = new Thread(runnable);
            threads[i].start();
        }


        /*
        for (int i = 0; i < 100; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */

        boolean bFinish;

        do {
            bFinish = true;

            for (int i = 0; i < 100; i++) {
                if (threads[i].isAlive()) {
                    bFinish = false;
                    break;
                }
            }
        } while (!bFinish);

        System.out.println("count: " + counter.getCount());
    }
}
