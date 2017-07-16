package com.designpatterns.ui.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.item.PatternItem;
import com.designpatterns.pattern.factory.Pattern;

import java.util.List;

public class ListRecyclerAdapter extends RecyclerView.Adapter<ListRecyclerAdapter.PatternViewHolder> {

    private List<Pattern> data;
    private OnPatternItemClickListener onPatternItemClickListener;

    public ListRecyclerAdapter(@NonNull List<Pattern> data,
                               @NonNull OnPatternItemClickListener onPatternItemClickListener) {

        this.data = data;
        this.onPatternItemClickListener = onPatternItemClickListener;
    }

    @Override
    public PatternViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PatternViewHolder(new PatternItem(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(PatternViewHolder holder, int position) {
        if (position > -1 && position < data.size()) {
            final Pattern pattern = data.get(position);
            PatternItem item = (PatternItem) holder.itemView;
            item.bindData(pattern);
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onPatternItemClickListener.onPatternItemClicked(pattern);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public interface OnPatternItemClickListener {

        void onPatternItemClicked(Pattern pattern);
    }

    class PatternViewHolder extends RecyclerView.ViewHolder {

        public PatternViewHolder(View itemView) {
            super(itemView);
        }
    }
}
