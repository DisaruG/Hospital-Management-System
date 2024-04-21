package org.example;

public class Person {
    private int id;
    private String name;
    private String contactInformation;
    private String address;

    public Person(int id, String name, String contactInformation, String address) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
