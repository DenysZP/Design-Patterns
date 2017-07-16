package com.designpatterns.ui.example.structural.proxy;

import com.designpatterns.ui.example.structural.adapter.LocalUser;

import java.util.Arrays;
import java.util.List;

public class DatabaseConnectionImpl implements DatabaseConnection {

    @Override
    public List<LocalUser> getUserList() {
        return Arrays.asList(new LocalUser("Andrea Walters", "1990-Sep-10", "5830046493"),
                new LocalUser("Gladys Wood", "1992-Nov-14", "5830061533"),
                new LocalUser("Chester Kuhn", "1989-Jul-24", "5832563463"));
    }
}
