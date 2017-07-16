package com.designpatterns.ui.example.behavioral.command;

import android.widget.EditText;

public class CutCommand extends Command {

    public CutCommand(EditText editText) {
        super(editText);
    }

    @Override
    public Boolean execute() {
        int start = editText.getSelectionStart();
        int end = editText.getSelectionEnd();
        if (start != -1 || end != -1) {
            backup();
            buffer = editText.getText().toString().substring(start, end);
            editText.getText().delete(start, end);
            return true;
        }
        return false;
    }
}
