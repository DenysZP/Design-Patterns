package com.designpatterns.ui.example.structural.adapter;

import java.util.Date;

public class Contact {

    private String firstName;
    private String surname;
    private Date age;
    private String phoneNumber;

    public Contact(String firstName, String surname, Date age, String phoneNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
