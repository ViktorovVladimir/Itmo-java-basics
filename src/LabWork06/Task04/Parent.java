package LabWork06.Task04;

import java.util.Scanner;

public class Parent {

    protected int iNumber;

    public void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        iNumber = scanner.nextInt();
    }
}
