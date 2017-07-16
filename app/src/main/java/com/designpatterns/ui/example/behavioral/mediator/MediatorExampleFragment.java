package com.designpatterns.ui.example.behavioral.mediator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MediatorExampleFragment extends Fragment {

    @BindView(R.id.titleEdt)
    TitleEditText titleEdt;

    @BindView(R.id.noteEdt)
    NoteEditText noteEdt;

    @BindView(R.id.clearButton)
    ClearButton clearButton;

    @BindView(R.id.saveButton)
    SaveButton saveButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mediator_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        Mediator mediator = new Editor(getContext());
        mediator.registerUiComponent(titleEdt);
        mediator.registerUiComponent(noteEdt);
        mediator.registerUiComponent(clearButton);
        mediator.registerUiComponent(saveButton);
    }
}
