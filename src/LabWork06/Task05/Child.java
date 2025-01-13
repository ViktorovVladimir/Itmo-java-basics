package LabWork06.Task05;

import java.util.Scanner;

public class Child extends Parent {

    public void inputAge() {
        System.out.print("Child: Enter an age value: ");
        super.iAge = super.scanner.nextInt();
        System.out.println("iAge: " + iAge);
    }
}
