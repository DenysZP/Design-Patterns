package com.designpatterns.ui.example.behavioral.iterator;

import com.designpatterns.ui.example.structural.adapter.LocalUser;
import com.designpatterns.ui.example.structural.adapter.User;

public class OldUserDatabase implements Iterator {

    private User[] users;
    private int position;

    public OldUserDatabase() {
        users = new User[]{new LocalUser("Andrea Walters", "1990-Sep-10", "5830046493"),
                new LocalUser("Gladys Wood", "1992-Nov-14", "5830061533"),
                new LocalUser("Chester Kuhn", "1989-Jul-24", "5832563463")};
    }

    @Override
    public boolean hasNext() {
        return !(position >= users.length || users[position] == null);
    }

    @Override
    public Object next() {
        return users[position++];
    }
}
