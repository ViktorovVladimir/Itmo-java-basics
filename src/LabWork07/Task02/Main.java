package LabWork07.Task02;


import LabWork07.Task01.Airplane;

public class Main {

    public static void main(String[] args) {
        Airplane boing = new Airplane();
        Airplane.Wing rightWing = boing.new Wing(500);
        Airplane.Wing leftWing = boing.new Wing(499.9);
        rightWing.viewWeight();
        leftWing.viewWeight();
    }
}
