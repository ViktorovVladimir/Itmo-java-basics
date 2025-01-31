package LabWork11.Task03;

public class Counter {

    boolean bFlag = false;
    final Object lock = new Object();
    int iNum1 = 0, iNum2 = 0 ;

    public void method1() {
        synchronized (lock) {
            try {
                while (!bFlag) {
                    lock.wait();
                }
                System.out.println(iNum1 + " My name Thread 1.");
                iNum1++;
                bFlag = false; // Меняем очередь
                lock.notify(); // Разбудить другой поток
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {
        synchronized (lock) {
            try {
                while (bFlag) {
                    lock.wait();
                }
                System.out.println(iNum2 + " My name Thread 2.");
                iNum2++;
                bFlag = true; // Меняем очередь
                lock.notify(); // Разбудить другой поток
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
