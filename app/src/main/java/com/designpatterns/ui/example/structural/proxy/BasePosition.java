package com.designpatterns.ui.example.structural.proxy;

import com.designpatterns.ui.example.structural.adapter.LocalUser;

import java.util.List;

public abstract class BasePosition implements Position {

    private DatabaseConnection databaseConnection;

    @Override
    public void setDatabaseConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public List<LocalUser> getUserDatabase() throws Exception {
        return databaseConnection.getUserList();
    }
}
