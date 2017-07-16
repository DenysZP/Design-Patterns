package com.designpatterns.ui.example.creational.abstract_factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class AbstractFactoryExampleFragment extends Fragment {

    @BindView(R.id.buttonsContainer)
    LinearLayout buttonsContainer;

    @BindView(R.id.scrollView)
    ScrollView scrollView;

    private ButtonFactory buttonFactory;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_factory_method_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        buttonFactory = new DefaultButtonFactory();
    }

    @OnCheckedChanged(R.id.styleToggleButton)
    void onButtonStyleChanged(CompoundButton button) {
        buttonFactory = button.isChecked() ? new BorderlessButtonFactory() : new DefaultButtonFactory();
    }

    @OnClick(R.id.createButton)
    void onCreateButtonClicked() {
        if (buttonFactory != null) {
            buttonsContainer.addView(buttonFactory.createButton(getContext()));
            scrollView.pageScroll(View.FOCUS_DOWN);
        }
    }
}
