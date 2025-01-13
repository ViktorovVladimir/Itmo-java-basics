package LabWork06.Task05;

import java.util.Scanner;

public class Parent {

    protected int iAge;
    protected Scanner scanner;

    public Parent() {
        scanner = new Scanner(System.in);
    }

    protected void inputAge() {
        System.out.print("Parent: Enter an age value: ");
        iAge = scanner.nextInt();
        System.out.println("iAge = : " + iAge);
    }
}
