package LabWork06.Task02;

public class Client extends AbstractHuman {

    public Client(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurName());
    }
}
