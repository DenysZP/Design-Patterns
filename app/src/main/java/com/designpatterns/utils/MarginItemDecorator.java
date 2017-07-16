package com.designpatterns.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MarginItemDecorator extends RecyclerView.ItemDecoration {

    private int space;

    public MarginItemDecorator(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int position = parent.getChildAdapterPosition(view);
        outRect.top = position == 0 ? space : 0;
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;
    }
}