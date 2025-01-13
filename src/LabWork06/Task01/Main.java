package LabWork06.Task01;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        Human client = new Client("Ivan", "Sidorov", "Anapa-Bank");
        Human bw = new BankWorker("Vika", "Protasova", "GaspromBank");

        client.viewAllInfo();
        bw.viewAllInfo();

        System.out.println("\n");


        Field[] declaredFields = client.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field);
        }

        client = null;
        bw = null;
    }

}
