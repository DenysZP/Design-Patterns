package com.designpatterns.ui.example.structural.proxy;

public class Admin extends BasePosition {

    @Override
    public boolean isAdmin() {
        return true;
    }

    @Override
    public String getPositionName() {
        return "Admin";
    }
}
