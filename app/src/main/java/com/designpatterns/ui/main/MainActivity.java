package com.designpatterns.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.designpatterns.R;
import com.designpatterns.constant.Constant;
import com.designpatterns.ui.list.ListActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.creationalCategory, R.id.structuralCategory, R.id.behavioralCategory})
    void onCategoryClicked(View view) {

        switch (view.getId()) {

            case R.id.creationalCategory:
                startActivity(ListActivity.createIntent(this, Constant.Category.CREATIONAL));
                break;
            case R.id.structuralCategory:
                startActivity(ListActivity.createIntent(this, Constant.Category.STRUCTURAL));
                break;
            case R.id.behavioralCategory:
                startActivity(ListActivity.createIntent(this, Constant.Category.BEHAVIORAL));
                break;
        }
    }
}
