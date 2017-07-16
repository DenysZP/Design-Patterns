package com.designpatterns.ui.example.behavioral.strategy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StrategyExampleFragment extends Fragment {

    @BindView(R.id.dynamicButton)
    ColorButton dynamicButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_strategy_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        dynamicButton.setClickBehavior(new FadeBehavior());
    }
}
