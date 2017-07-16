package com.designpatterns.ui.example.behavioral.state;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class StateExampleFragment extends Fragment {

    private State state;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_state_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        if (state != null) {
            state.onTurnOn();
        } else {
            state = new EnabledState(this, null);
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    @OnClick(R.id.play)
    void onPlayClicked() {
        state.onPlay();
    }

    @OnClick(R.id.stop)
    void onStopClicked() {
        state.onStop();
    }

    @OnClick(R.id.previous)
    void onPreviousClicked() {
        state.onPrevious();
    }

    @OnClick(R.id.next)
    void onNextClicked() {
        state.onNext();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (state != null) {
            state.onTurnOff();
        }
    }
}
