package LabWork11.Task02;

class Counter {

    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public synchronized int getCount() {
        return count;
    }
}
