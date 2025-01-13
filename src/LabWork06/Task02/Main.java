package LabWork06.Task02;

public class Main {

    public static void main(String[] args) {

        Human client = new Client("Vitia", "Protasevich");
        Human bankWorker = new BankWorker("Vova", "Kotov", "GazProm");

        printInfo(client);
        printInfo(bankWorker);

        client = null;
        bankWorker = null;

    }

    public static void printInfo(Human hu) {
        hu.printInfo();
    }

}