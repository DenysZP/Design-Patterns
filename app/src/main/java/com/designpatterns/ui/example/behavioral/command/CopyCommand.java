package com.designpatterns.ui.example.behavioral.command;

import android.widget.EditText;

public class CopyCommand extends Command {

    public CopyCommand(EditText editText) {
        super(editText);
    }

    @Override
    public Boolean execute() {
        int start = editText.getSelectionStart();
        int end = editText.getSelectionEnd();
        if (start != -1 || end != -1) {
            buffer = editText.getText().toString().substring(start, end);
        }
        return false;
    }
}
