package LabWork02.Task02;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Flower flower = new Flower();
        System.out.println(flower);

        Flower tulip = new Flower("Tulip", 234, 10, 5, Color.YELLOW);
        System.out.println(tulip.getName());
        tulip.setPrice(230);

        System.out.println(tulip);

        tulip.setPrice(330);
        tulip.setColorBud(Color.RED);

        System.out.println(tulip);


        System.out.println(tulip.getColorBud().getDescription());
        System.out.println(tulip.getColorBud().getCode());

        flower = null;
        tulip = null;
    }

}
