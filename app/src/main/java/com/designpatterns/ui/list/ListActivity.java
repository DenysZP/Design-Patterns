package com.designpatterns.ui.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.designpatterns.R;
import com.designpatterns.constant.Constant;
import com.designpatterns.pattern.factory.BehavioralFactory;
import com.designpatterns.pattern.factory.CreationalFactory;
import com.designpatterns.pattern.factory.Pattern;
import com.designpatterns.pattern.factory.PatternFactory;
import com.designpatterns.pattern.factory.StructuralFactory;
import com.designpatterns.ui.example.ExampleContainerActivity;
import com.designpatterns.utils.MarginItemDecorator;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity
        implements ListRecyclerAdapter.OnPatternItemClickListener {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindDimen(R.dimen.card_view_margin)
    int cardViewMargin;

    public static Intent createIntent(Context context, int category) {
        Intent intent = new Intent(context, ListActivity.class);
        intent.putExtra(Constant.Extra.PATTERN_CATEGORY, category);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        }

        int category = getIntent().getIntExtra(Constant.Extra.PATTERN_CATEGORY, -1);
        PatternFactory factory;
        switch (category) {
            case Constant.Category.CREATIONAL:
                factory = new CreationalFactory();
                setTitle(R.string.category_creational_title);
                break;
            case Constant.Category.STRUCTURAL:
                factory = new StructuralFactory();
                setTitle(R.string.category_structural_title);
                break;
            case Constant.Category.BEHAVIORAL:
                factory = new BehavioralFactory();
                setTitle(R.string.category_behavioral_title);
                break;
            default:
                factory = new CreationalFactory();
                setTitle(R.string.category_creational_title);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListRecyclerAdapter(factory.createPatternList(), this));
        recyclerView.addItemDecoration(new MarginItemDecorator(cardViewMargin));
    }

    @Override
    public void onPatternItemClicked(Pattern pattern) {
        startActivity(ExampleContainerActivity.createIntent(this, pattern));
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
