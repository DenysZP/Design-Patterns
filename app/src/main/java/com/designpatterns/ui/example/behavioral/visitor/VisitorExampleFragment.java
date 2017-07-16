package com.designpatterns.ui.example.behavioral.visitor;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpatterns.R;
import com.designpatterns.ui.example.structural.composite.CircleShape;
import com.designpatterns.ui.example.structural.composite.CompoundShape;
import com.designpatterns.ui.example.structural.composite.DotShape;
import com.designpatterns.ui.example.structural.composite.DrawLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VisitorExampleFragment extends Fragment {

    @BindView(R.id.drawLayout)
    DrawLayout drawLayout;

    @BindView(R.id.shapeInfo)
    TextView shapeInfo;

    private DotVisitorShape dotShape;
    private CircleVisitorShape circleShape;
    private CompoundVisitorShape compoundShape;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_visitor_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        dotShape = new DotVisitorShape(20, 20, Color.RED);
        circleShape = new CircleVisitorShape(120, 120, 60, Color.GREEN);
        compoundShape = new CompoundVisitorShape(
                new DotShape(260, 260, Color.BLUE),
                new CircleShape(260, 260, 80, Color.BLUE)
        );
        setupVisitor(new DrawVisitor(drawLayout));
        setupVisitor(new PrinterVisitor(shapeInfo));
    }

    private void setupVisitor(Visitor visitor) {
        visitor.visit(dotShape, circleShape, compoundShape);
    }
}
