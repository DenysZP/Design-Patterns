package com.designpatterns.ui.example.structural.proxy;

import com.designpatterns.ui.example.structural.adapter.LocalUser;

import java.util.List;

public class DatabaseConnectionProtectionProxy implements DatabaseConnection {

    private Position position;

    public DatabaseConnectionProtectionProxy(Position position) {
        this.position = position;
    }

    @Override
    public List<LocalUser> getUserList() {
        if (position.isAdmin()) {
            return new DatabaseConnectionImpl().getUserList();
        } else {
            throw new RuntimeException("No access rights!");
        }
    }
}
