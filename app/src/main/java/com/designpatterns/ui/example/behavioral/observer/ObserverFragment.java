package com.designpatterns.ui.example.behavioral.observer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpatterns.R;

public class ObserverFragment extends Fragment implements Observer {

    private Subject subject;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_observer, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Fragment fragment = getParentFragment();
        if (fragment instanceof ObserverExampleFragment) {
            subject = ((ObserverExampleFragment) fragment).getSubject();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (subject != null) {
            subject.registerObserver(this);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (subject != null) {
            subject.unregisterObserver(this);
        }
    }

    @Override
    public void update(String data) {
        View view = getView();
        if (view instanceof TextView) {
            ((TextView) view).setText(data);
        }
    }
}
