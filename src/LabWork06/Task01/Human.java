package LabWork06.Task01;

public abstract class Human {

    private String sName;
    private String sSurName;


    public Human(String sName, String sSurName) {
        this.sName = sName;
        this.sSurName = sSurName;
    }

    public String getName() {
        return sName;
    }

    public String getSurName() {
        return sSurName;
    }

    public void print() {
        System.out.println("\nMethod from " + this.getClass().getSimpleName() + " class");
    }

    public abstract void viewAllInfo();
}
