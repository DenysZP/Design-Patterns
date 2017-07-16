package com.designpatterns.ui.example.behavioral.mediator;

public interface Mediator {

    String CLEAR = "clear";
    String SAVE = "save";
    String TITLE = "title";
    String NOTE = "note";

    void registerUiComponent(UiComponent uiComponent);

    void clear();

    void save();

    void onTitleTextChanged(String title);

    void onNoteTextChanged(String note);
}
