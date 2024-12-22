package LabWork02.Task01;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static DivisionResult div(int a, int b) {
        if (b != 0) {
            return new DivisionResult(a / b, a % b);
        }
        return new DivisionResult();
    }

    public static DivisionResult div(long a, long b) {
        if (b != 0) {
            return new DivisionResult(a / b, a % b);
        }
        return new DivisionResult();
    }

    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return -1;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static long mult(long a, long b) {
        return a * b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static long sub(long a, long b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

}
