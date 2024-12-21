package LabWork02.Task01;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Test -=Sum=- ");
        System.out.println("Summa int values: " + Calculator.sum(7, 3));
        System.out.println("Summa long values:: " + calculator.sum(70000000000L, 30000000000L));
        System.out.println("Summa double values:: " + calculator.sum(6.5, 4.5));

        System.out.println("\nTest -=Div=- ");
        System.out.println("Division int values: " + calculator.div(12, 3));
        System.out.println("Division long values: " + calculator.div(70000000000L, 7));
        System.out.println("Division double values: " + calculator.div(15.0, 2.0));

        System.out.println("\nTest -=Multiplication=- ");
        System.out.println("Multiple int values: " + calculator.mult(6, 3));
        System.out.println("Multiple long values: " + calculator.mult(40000000000L, 2));
        System.out.println("Multiple double values: " + calculator.mult(4.5, 3.5));

        System.out.println("\nTest -=Subtraction=- ");
        System.out.println("Subtraction int values: " + calculator.sub(7, 2));
        System.out.println("Subtraction long values: " + calculator.sub(60000000000L, 20000000000L));
        System.out.println("Subtraction double values: " + calculator.sub(5.5, 4.5));
    }
}
