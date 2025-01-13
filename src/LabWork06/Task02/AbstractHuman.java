package LabWork06.Task02;

public class AbstractHuman implements Human {

    protected String sName;
    protected String sSurName;

    public AbstractHuman(String name, String surname) {
        this.sName = name;
        this.sSurName = surname;
    }

    @Override
    public String getName() {
        return sName;
    }

    @Override
    public String getSurName() {
        return sSurName;
    }
}
