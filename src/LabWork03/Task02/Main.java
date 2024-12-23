package LabWork03.Task02;

public class Main {

    public static void main(String[] args) {

        Car s90 = new Car();
        s90.setName("Volvo", "S90");
        s90.setColor(Color.YELLOW);
        s90.setWeight(2000);
        System.out.println(s90.toString());

        Car ford = new Car(Color.BLACK);
        ford.setName("Ford", "Fiesta");
        ford.setWeight(1800);
        System.out.println(ford.toString());

        Car lada = new Car(Color.RED, 1500);
        lada.setName("Lada", "Kalina");
        System.out.println(lada.toString());

        s90 = null;
        ford = null;
        lada = null;
    }
}
