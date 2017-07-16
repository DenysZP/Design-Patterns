package com.designpatterns.ui.example.structural.proxy;

public class Employee extends BasePosition {

    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public String getPositionName() {
        return "Employee";
    }
}
