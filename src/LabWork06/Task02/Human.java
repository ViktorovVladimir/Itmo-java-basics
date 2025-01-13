package LabWork06.Task02;

public interface Human {

    public abstract String getName();

    public abstract String getSurName();


    public default void printInfo() {
    }

    public default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
        //logic
    }

    private static void privateMethod() {   //no in java 8

    }
}
