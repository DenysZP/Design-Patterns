package com.designpatterns.ui.example.creational.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingletonExampleFragment extends Fragment {

    private static final String HASH_CODE_TEXT = "Hash code: ";

    @BindView(R.id.hashCodes)
    TextView hashCodes;

    @BindView(R.id.scrollView)
    ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_singleton_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @OnClick(R.id.getInstanceButton)
    void onGetInstanceButtonClicked() {
        if (!hashCodes.getText().toString().isEmpty()) {
            hashCodes.append("\n");
        }
        hashCodes.append(HASH_CODE_TEXT);
        hashCodes.append(String.valueOf(Singleton.getInstance().hashCode()));
        scrollView.pageScroll(View.FOCUS_DOWN);
    }
}
