package LabWork02.Task02;

public class Flower {
    private String name;
    private double price;
    private int stemLength;
    private int sheetLength;
    private Color colorBud;

    public Flower() {
    }

    public Flower(String name, double price, int stemLength, int sheetLength, Color colorBud) {
        this.name = name;
        this.price = price;
        this.stemLength = stemLength;
        this.sheetLength = sheetLength;
        this.colorBud = colorBud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getSheetLength() {
        return sheetLength;
    }

    public void setSheetLength(int sheetLength) {
        this.sheetLength = sheetLength;
    }

    public Color getColorBud() {
        return colorBud;
    }

    public void setColorBud(Color colorBud) {
        this.colorBud = colorBud;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stemLength=" + stemLength +
                ", sheetLength=" + sheetLength +
                ", colorBud=" + colorBud +
                '}';
    }
}
