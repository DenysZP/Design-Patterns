package com.designpatterns.ui.example.behavioral.command;

import android.text.TextUtils;
import android.widget.EditText;

public class PasteCommand extends Command {

    public PasteCommand(EditText editText) {
        super(editText);
    }

    @Override
    public Boolean execute() {
        if (TextUtils.isEmpty(buffer)) {
            return false;
        }
        backup();
        int position = editText.getSelectionStart();
        editText.setText(editText.getText().insert(position, buffer));
        editText.setSelection(position);
        return true;
    }
}
