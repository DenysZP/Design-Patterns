package com.designpatterns.ui.example.behavioral.memento;

import com.designpatterns.ui.example.structural.adapter.LocalUser;
import com.designpatterns.ui.example.structural.adapter.User;

public class Originator {

    private String username;
    private String age;
    private String contactData;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setContactData(String contactData) {
        this.contactData = contactData;
    }

    public Memento saveUserState() {
        return new Memento(new LocalUser(username, age, contactData));
    }

    public User restoreUserState(Memento memento) {
        return memento.getUserState();
    }

}
