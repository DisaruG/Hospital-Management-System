package org.example;

public class Doctor extends Person{
    private String specialization;

    public Doctor(int id, String name, String contactInformation, String address, String specialization) {
        super(id, name, contactInformation, address);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
