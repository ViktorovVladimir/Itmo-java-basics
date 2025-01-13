package LabWork06.Task01;

import LabWork06.Task01.Human;

public class Client extends Human {

    private String sBankName;

    public Client(String name, String surname, String bankname) {
        super(name, surname);
        this.sBankName = bankname;
    }

    public void viewAllInfo() {

        print();

        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurName());
        System.out.println("Bank Name: " + sBankName);
    }

}
