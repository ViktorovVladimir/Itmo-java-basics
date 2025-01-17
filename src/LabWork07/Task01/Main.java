package LabWork07.Task01;


public class Main {

    public static void main(String[] args) {
        Airplane boing = new Airplane();
        Airplane.Wing wing = boing.new Wing(500);
        wing.viewWeight();
    }
}
