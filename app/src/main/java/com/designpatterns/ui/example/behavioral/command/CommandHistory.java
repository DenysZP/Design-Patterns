package com.designpatterns.ui.example.behavioral.command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public Boolean isEmpty() {
        return history.isEmpty();
    }
}