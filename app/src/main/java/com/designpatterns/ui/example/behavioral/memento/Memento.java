package com.designpatterns.ui.example.behavioral.memento;

import com.designpatterns.ui.example.structural.adapter.User;

public class Memento {

    private User userState;

    public Memento(User userState) {
        this.userState = userState;
    }

    public User getUserState() {
        return userState;
    }
}
