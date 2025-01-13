package LabWork06.Task01;

public class BankWorker extends Human {

    private String sBankName;

    public BankWorker(String name, String surname, String bankname) {
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
