package com.designpatterns.ui.example.behavioral.mediator;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Editor implements Mediator {

    private Context context;
    private EditText title;
    private EditText note;
    private Button clear;
    private Button save;

    private String titleText;
    private String noteText;

    public Editor(Context context) {
        this.context = context;
    }

    @Override
    public void registerUiComponent(UiComponent uiComponent) {
        uiComponent.setMediator(this);
        switch (uiComponent.getName()) {
            case Mediator.TITLE:
                title = (EditText) uiComponent;
                break;
            case Mediator.NOTE:
                note = (EditText) uiComponent;
                break;
            case Mediator.CLEAR:
                clear = (Button) uiComponent;
                break;
            case Mediator.SAVE:
                save = (Button) uiComponent;
                break;
        }
    }

    @Override
    public void clear() {
        title.setText("");
        note.setText("");
    }

    @Override
    public void save() {
        Toast.makeText(context, "The note has been saved.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTitleTextChanged(String title) {
        if (title.length() > 10) {
            Toast.makeText(context, "The maximum length of the title is 10 characters.", Toast.LENGTH_SHORT).show();
            this.title.setText(titleText);
            return;
        }
        titleText = title;
        changeButtonsState();
    }

    @Override
    public void onNoteTextChanged(String note) {
        if (note.length() > 50) {
            Toast.makeText(context, "The maximum length of the note is 50 characters.", Toast.LENGTH_SHORT).show();
            this.note.setText(noteText);
            return;
        }
        noteText = note;
        changeButtonsState();
    }

    private void changeButtonsState() {
        boolean isEnabled = !TextUtils.isEmpty(titleText) && !TextUtils.isEmpty(noteText);
        save.setEnabled(isEnabled);
        clear.setEnabled(isEnabled);
    }
}
