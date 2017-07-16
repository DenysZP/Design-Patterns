package com.designpatterns.ui.example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.designpatterns.R;
import com.designpatterns.constant.Constant;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcels;

import butterknife.ButterKnife;

public class ExampleContainerActivity extends AppCompatActivity {

    public static Intent createIntent(Context context, Pattern pattern) {
        Intent intent = new Intent(context, ExampleContainerActivity.class);
        intent.putExtra(Constant.Extra.PATTERN, Parcels.wrap(pattern));
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_container);
        ButterKnife.bind(this);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        }

        Pattern pattern = Parcels.unwrap(getIntent().getParcelableExtra(Constant.Extra.PATTERN));
        setTitle(pattern.getTitleResource());

        SimpleExampleFactory exampleFactory = new SimpleExampleFactory();
        Fragment fragment = exampleFactory.getExampleFragment(pattern);

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
