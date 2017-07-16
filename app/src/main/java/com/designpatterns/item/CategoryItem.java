package com.designpatterns.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.TextView;

import com.designpatterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryItem extends CardView {

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.description)
    TextView description;

    public CategoryItem(Context context) {
        super(context);
        init(context, null);
    }

    public CategoryItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CategoryItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CategoryItem, 0, 0);

        String titleText = a.getString(R.styleable.CategoryItem_title);
        String descriptionText = a.getString(R.styleable.CategoryItem_description);

        a.recycle();

        setUseCompatPadding(true);
        setPreventCornerOverlap(false);

        inflate(context, R.layout.item_category, this);
        ButterKnife.bind(this);

        title.setText(titleText != null ? titleText : "");
        description.setText(descriptionText != null ? descriptionText : "");
    }
}
