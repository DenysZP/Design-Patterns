package com.designpatterns.ui.example.structural.adapter;

public class LocalUser implements User {

    private String username;
    private String age;
    private String contactData;

    public LocalUser(String username, String age, String contactData) {
        this.username = username;
        this.age = age;
        this.contactData = contactData;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String getContactData() {
        return contactData;
    }
}
