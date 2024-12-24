package LabWork03.Task04;

public class Tree {

    private int iAge;
    private boolean bIsAlive;
    private String sName;

    private static int iNumTree = 0;


    static {
        System.out.println("Static block start");
        System.out.println("Static block end");
    }

    {
        iNumTree++;
        System.out.println("tree No. " + iNumTree);
    }

    public Tree(int age, String name) {
        this.iAge = age;
        this.bIsAlive = true;
        this.sName = name;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.iAge = age;
        this.bIsAlive = isAlive;
        this.sName = name;
    }

    public Tree() {
        System.out.println("Empty constructor with no parameters worked");
    }

    public void viewInfo() {
        System.out.println("Tree name: " + this.sName);
        System.out.println("Tree age: " + this.iAge + " years");
        System.out.println("Is the tree alive?: " + (this.bIsAlive ? "Yes" : "No"));
        System.out.println();
    }

}
