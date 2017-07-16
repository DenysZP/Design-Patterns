package com.designpatterns.ui.example.behavioral.command;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CommandEampleFragment extends Fragment {

    @BindView(R.id.noteEdt)
    EditText noteEdt;

    private CommandHistory history;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_command_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        history = new CommandHistory();
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    @OnClick(R.id.copy)
    void onCopyClicked() {
        executeCommand(new CopyCommand(noteEdt));
    }

    @OnClick(R.id.cut)
    void onCutClicked() {
        executeCommand(new CutCommand(noteEdt));
    }

    @OnClick(R.id.paste)
    void onPasteClicked() {
        executeCommand(new PasteCommand(noteEdt));
    }

    @OnClick(R.id.undo)
    void onUndoClicked() {

        if (!history.isEmpty()) {
            Command command = history.pop();
            if (command != null) {
                command.undo();
            }
        }
    }
}
