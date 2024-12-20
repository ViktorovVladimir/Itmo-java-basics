package Task06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int b = scanner.nextInt();

        if (b % 2 > 0) {
            System.out.println("Odd value");
        } else {
            if (b > 100) {
                System.out.println("Even value, out of range");
            } else {
                System.out.println("Even value");
            }
        }

        scanner.close();
    }

}
