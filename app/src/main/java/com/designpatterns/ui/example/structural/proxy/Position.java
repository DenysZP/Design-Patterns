package com.designpatterns.ui.example.structural.proxy;

import com.designpatterns.ui.example.structural.adapter.LocalUser;

import java.util.List;

public interface Position {

    boolean isAdmin();

    String getPositionName();

    void setDatabaseConnection(DatabaseConnection databaseConnection);

    List<LocalUser> getUserDatabase() throws Exception;
}
