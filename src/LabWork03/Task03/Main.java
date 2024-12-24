package LabWork03.Task03;

public class Main {

    public static void main(String[] args) {

        House nauka = new House();
        nauka.setAllValues(20, 2023, "GK Nauka");
        System.out.println(nauka.toString());

        House orbita = new House();
        orbita.setAllValues(16, 2012, "GK Orbita");
        System.out.println(orbita.toString());

        nauka = null;
        orbita = null;
    }
}
