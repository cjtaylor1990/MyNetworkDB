package com.mynetworkdb.data.contacts.humans;

public class HumanContact {
    private String firstName;
    private String lastName;
    private String age;
    private String dateOfBirth;

    public HumanContact() {}

    public HumanContact(String[] input) {
        this.firstName = input[0];
        this.lastName = input[1];
        this.age = input[2];
        this.dateOfBirth = input[3];
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
