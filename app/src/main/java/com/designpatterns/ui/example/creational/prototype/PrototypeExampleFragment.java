package com.designpatterns.ui.example.creational.prototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpatterns.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrototypeExampleFragment extends Fragment {

    @BindView(R.id.nativeExample)
    TextView nativeExample;

    @BindView(R.id.nativeExampleClone)
    TextView nativeExampleClone;

    @BindView(R.id.constructorExample)
    TextView constructorExample;

    @BindView(R.id.constructorExampleClone)
    TextView constructorExampleClone;

    private Random random;
    private NativePrototypeExample nativePrototypeExample;
    private ConstructorPrototypeExample constructorPrototypeExample;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_prototype_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        random = new Random();
        createExamples();
    }

    private void createExamples() {

        nativePrototypeExample = new NativePrototypeExample(
                random.nextInt(),
                NativePrototypeExample.class.getSimpleName());
        nativeExample.setText(nativePrototypeExample.toString());

        constructorPrototypeExample = new ConstructorPrototypeExample(
                random.nextInt(),
                ConstructorPrototypeExample.class.getSimpleName());
        constructorExample.setText(constructorPrototypeExample.toString());
    }

    @OnClick(R.id.cloneButton)
    void onCloneButtonClicked() {

        try {
            nativeExampleClone.setText(nativePrototypeExample.clone().toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        constructorExampleClone.setText(constructorPrototypeExample.cloneObject().toString());
    }
}
