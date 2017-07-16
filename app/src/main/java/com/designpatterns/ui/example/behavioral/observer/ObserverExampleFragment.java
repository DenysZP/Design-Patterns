package com.designpatterns.ui.example.behavioral.observer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;

import butterknife.ButterKnife;
import butterknife.OnTextChanged;

public class ObserverExampleFragment extends Fragment {

    private InputData subject;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_observer_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        subject = new InputData();

        FragmentManager manager = getChildFragmentManager();
        manager.beginTransaction().replace(R.id.leftContainer, new ObserverFragment()).commit();
        manager.beginTransaction().replace(R.id.rightContainer, new ObserverFragment()).commit();
    }

    public Subject getSubject() {
        return subject;
    }

    @OnTextChanged(R.id.editText)
    void onTextChanged(CharSequence text) {
        if (subject != null) {
            subject.updateData(text.toString());
        }
    }
}
