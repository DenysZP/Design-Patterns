package com.designpatterns.ui.example.behavioral.iterator;

import com.designpatterns.ui.example.structural.adapter.LocalUser;
import com.designpatterns.ui.example.structural.adapter.User;

import java.util.ArrayList;
import java.util.List;

public class NewUserDatabase implements Iterator {

    private List<User> userList;
    private int position;

    public NewUserDatabase() {
        userList = new ArrayList<>();
        userList.add(new LocalUser("Jerry Stanley", "1987-Jul-02", "5159456493"));
        userList.add(new LocalUser("Sue Robertson", "1991-Jun-14", "5652966565"));
    }

    @Override
    public boolean hasNext() {
        return !(position >= userList.size() || userList.get(position) == null);
    }

    @Override
    public Object next() {
        return userList.get(position++);
    }
}
