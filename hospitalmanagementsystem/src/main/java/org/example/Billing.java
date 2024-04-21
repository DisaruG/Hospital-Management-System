package org.example;

public class Billing {
    private int id;
    private Patient patient;
    private double amount;
    private boolean paid;

    public Billing(int id, Patient patient, double amount, boolean paid) {
        this.id = id;
        this.patient = patient;
        this.amount = amount;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
