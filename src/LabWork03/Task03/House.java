package LabWork03.Task03;

import java.time.LocalDate;

public class House {
    private int iNumFloors;
    private int iYearConstruction;
    private String sName;


    public void setAllValues(int floors, int year, String name) {
        this.iNumFloors = floors;
        this.iYearConstruction = year;
        this.sName = name;
    }

    public int yearsSinceConstruction() {
        return LocalDate.now().getYear() - this.iYearConstruction;
    }

    @Override
    public String toString() {
        return "House{" +
                "number floors=" + iNumFloors +
                ", year of construction=" + iYearConstruction +
                ", name='" + sName + '\'' +
                ", number of years since construction='" + yearsSinceConstruction() + '\'' +
                '}';
    }
}