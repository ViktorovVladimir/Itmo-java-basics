package LabWork06.Task02;


public class BankWorker extends AbstractHuman {

    private String sBankName;

    public BankWorker(String name, String surname, String bankname) {
        super(name, surname);
        this.sBankName = bankname;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurName());
        System.out.println("Bank Name: " + sBankName);
    }
}
