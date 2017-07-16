package com.designpatterns.ui.example.behavioral.memento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.designpatterns.R;
import com.designpatterns.ui.example.structural.adapter.LocalUser;
import com.designpatterns.ui.example.structural.adapter.User;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MementoExampleFragment extends Fragment {

    @BindView(R.id.usernameEdt)
    EditText usernameEdt;

    @BindView(R.id.ageEdt)
    EditText ageEdt;

    @BindView(R.id.contactEdt)
    EditText contactEdt;

    @BindView(R.id.restoreButton)
    Button restoreButton;

    private User user;
    private Originator originator;
    private Caretaker caretaker;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_memento_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        originator = new Originator();
        caretaker = new Caretaker();

        user = new LocalUser("Andrea Walters", "1990-Sep-10", "5830046493");
        bindUserData();
    }

    private void bindUserData() {

        usernameEdt.setText(user.getUsername());
        ageEdt.setText(user.getAge());
        contactEdt.setText(user.getContactData());
    }

    @OnClick(R.id.restoreButton)
    void onRestoreButtonClicked() {
        if (caretaker.isSavedDataExist()) {
            user = originator.restoreUserState(caretaker.getMemento());
            bindUserData();
            restoreButton.setEnabled(caretaker.isSavedDataExist());
        }
    }

    @OnClick(R.id.saveButton)
    void onSaveButtonClicked() {
        caretaker.addMemento(originator.saveUserState());
        restoreButton.setEnabled(true);
    }

    @OnTextChanged(R.id.usernameEdt)
    void onUsernameChanged(CharSequence text) {
        originator.setUsername(text.toString());
    }

    @OnTextChanged(R.id.ageEdt)
    void onAgeChanged(CharSequence text) {
        originator.setAge(text.toString());
    }

    @OnTextChanged(R.id.contactEdt)
    void onContactChanged(CharSequence text) {
        originator.setContactData(text.toString());
    }
}
