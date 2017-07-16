package com.designpatterns.ui.example.behavioral.command;

import android.widget.EditText;

public abstract class Command {

    protected static String buffer;
    public EditText editText;
    protected String backup;

    public Command(EditText editText) {
        this.editText = editText;
    }

    protected void backup() {
        backup = editText.getText().toString();
    }

    public void undo() {
        editText.setText(backup);
    }

    public abstract Boolean execute();
}