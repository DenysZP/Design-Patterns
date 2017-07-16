package com.designpatterns.ui.example.behavioral.memento;

import android.support.annotation.Nullable;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> mementos;

    public Caretaker() {
        mementos = new Stack<>();
    }

    public void addMemento(Memento m) {
        mementos.push(m);
    }

    @Nullable
    public Memento getMemento() {
        if (mementos.size() == 0) {
            return null;
        } else {
            return mementos.pop();
        }
    }

    public boolean isSavedDataExist() {
        return !mementos.isEmpty();
    }
}
