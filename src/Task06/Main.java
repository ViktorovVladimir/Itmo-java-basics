package Task06;

import java.util.Scanner;

public class Main {

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int b = scanner.nextInt();

        if( b%2 > 0 )
            System.out.println("Нечетное");
        else
        {
            if( b > 100)
                System.out.println("Четное, выход за пределы диапазона");
            else
                System.out.println("Четное");
        }

        scanner.close();
    }

}
