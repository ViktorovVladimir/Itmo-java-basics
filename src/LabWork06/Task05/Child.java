package LabWork06.Task05;

import java.util.Scanner;

public class Child extends Parent {

    String sName;

    public void inputAge() {
        System.out.print("Child: Enter your name: ");
        sName = scanner.nextLine();
        System.out.println("Name is : " + sName);
    }
}
