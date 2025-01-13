package LabWork06.Task03;

import LabWork06.Task01.Client;
import LabWork06.Task01.Human;

public class Main {

    public static void main(String[] args) {

        Car truck = new Truck(50, "Man", 'B', (float)80.6, 6, 500);

        truck.outPut();

        truck = null;

    }

}