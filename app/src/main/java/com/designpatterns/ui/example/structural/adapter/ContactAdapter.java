package com.designpatterns.ui.example.structural.adapter;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class ContactAdapter implements User {

    private Contact contact;

    public ContactAdapter(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String getUsername() {
        return contact.getFirstName() + " " + contact.getSurname();
    }

    @Override
    public String getAge() {
        return new SimpleDateFormat("yyyy-MMM-dd", Locale.getDefault()).format(contact.getAge());
    }

    @Override
    public String getContactData() {
        return contact.getPhoneNumber().replaceAll("\\D", "");
    }
}
