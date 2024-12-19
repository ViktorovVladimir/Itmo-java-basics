package Task05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int iValue1 = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int iValue2 = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int iValue3 = scanner.nextInt();
        System.out.println("Вы ввели:");
        System.out.println(iValue1);
        System.out.println(iValue2);
        System.out.println(iValue3);
    }
}
