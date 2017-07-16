package com.designpatterns.ui.example.structural.flyweight;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.designpatterns.R;
import com.designpatterns.ui.example.structural.composite.DrawLayout;
import com.designpatterns.ui.example.structural.composite.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FlyweightExampleFragment extends Fragment {

    @BindView(R.id.optimizedLayout)
    DrawLayout optimizedLayout;

    @BindView(R.id.optimizedValue)
    TextView optimizedValue;

    @BindView(R.id.notOptimizedLayout)
    DrawLayout notOptimizedLayout;

    @BindView(R.id.notOptimizedValue)
    TextView notOptimizedValue;

    private Runtime runtime;
    private Random random;
    private int maxX;
    private int maxY;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_flyweight_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        runtime = Runtime.getRuntime();

        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        maxX = size.x;
        maxY = size.y;
        random = new Random();
    }

    @OnClick(R.id.beginTestButton)
    void onBeginTestButtonClicked() {

        double memory_1 = ((double) (runtime.totalMemory() / 1024) / 1024 - (double) (runtime.freeMemory() / 1024) / 1024);
        List<Shape> optimizedList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            CircleTypedShape circleTypedShape = new CircleTypedShape(random.nextInt(maxX), random.nextInt(maxY), random.nextInt(500),
                    Color.rgb(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256)), ShapeTypeFactory.getShapeType(CircleTypedShape.class.getSimpleName()));
            optimizedList.add(circleTypedShape);
            DotTypedShape dotTypedShape = new DotTypedShape(random.nextInt(maxX), random.nextInt(maxY),
                    Color.rgb(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256)), ShapeTypeFactory.getShapeType(DotTypedShape.class.getSimpleName()));
            optimizedList.add(dotTypedShape);
        }
        double memory_2 = ((double) (runtime.totalMemory() / 1024) / 1024 - (double) (runtime.freeMemory() / 1024) / 1024);
        optimizedValue.setText(String.format("Optimized = %s, Mb", memory_2 - memory_1));

        memory_1 = ((double) (runtime.totalMemory() / 1024) / 1024 - (double) (runtime.freeMemory() / 1024) / 1024);
        List<Shape> notOptimizedList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            CircleTypedShape circleTypedShape = new CircleTypedShape(random.nextInt(maxX), random.nextInt(maxY), random.nextInt(500),
                    Color.rgb(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256)), new ShapeType(CircleTypedShape.class.getSimpleName()));
            notOptimizedList.add(circleTypedShape);
            DotTypedShape dotTypedShape = new DotTypedShape(random.nextInt(maxX), random.nextInt(maxY),
                    Color.rgb(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256)), new ShapeType(DotTypedShape.class.getSimpleName()));
            notOptimizedList.add(dotTypedShape);
        }
        memory_2 = ((double) (runtime.totalMemory() / 1024) / 1024 - (double) (runtime.freeMemory() / 1024) / 1024);
        notOptimizedValue.setText(String.format("Not optimized = %s, Mb", memory_2 - memory_1));

        optimizedLayout.addShapes(optimizedList.toArray(new Shape[optimizedList.size()]));
        notOptimizedLayout.addShapes(notOptimizedList.toArray(new Shape[notOptimizedList.size()]));
    }
}
