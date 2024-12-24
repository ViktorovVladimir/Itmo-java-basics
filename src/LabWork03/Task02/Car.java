package LabWork03.Task02;

public class Car {
    private String sBrand;
    private String sModel;
    private Color color;
    private int iWeight;

    public Car() {
        this.color = Color.NONE;
        this.sBrand = "Not set";
        this.sModel = "Not set";
        this.iWeight = -1;
    }

    public Car(Color color) {
        this.color = color;
        this.sBrand = "Not set";
        this.sModel = "Not set";
        this.iWeight = -1;
    }

    public Car(Color color, int weight) {
        this.color = color;
        this.sBrand = "Not set";
        this.sModel = "Not set";
        this.iWeight = weight;
    }

    public void setName(String brand, String model) {
        this.sBrand = brand;
        this.sModel = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.iWeight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + sBrand + '\'' +
                ", model='" + sModel + '\'' +
                ", color=" + color +
                ", weight=" + iWeight +
                '}';
    }
}
