package com.designpatterns.item;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PatternItem extends CardView {

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.description)
    TextView description;

    @BindView(R.id.image)
    ImageView image;

    public PatternItem(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {

        inflate(context, R.layout.item_pattern, this);
        ButterKnife.bind(this);
    }

    public void bindData(Pattern pattern) {

        title.setText(pattern.getTitleResource());
        description.setText(pattern.getDescriptionResource());
        image.setImageResource(pattern.getImageResource());
    }
}
