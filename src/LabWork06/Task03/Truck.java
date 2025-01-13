package LabWork06.Task03;

public class Truck extends Car {

    int iCountWheels;
    int iMaxWeight;

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);

        this.iCountWheels = wheels;
        this.iMaxWeight = maxWeight;
    }

    public void newWheels(int value) {
        iCountWheels = value;
    }
}
