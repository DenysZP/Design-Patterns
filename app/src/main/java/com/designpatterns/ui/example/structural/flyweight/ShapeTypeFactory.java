package com.designpatterns.ui.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeTypeFactory {

    private static Map<String, ShapeType> shapeTypes = new HashMap<>();

    public static ShapeType getShapeType(String name) {
        ShapeType result = shapeTypes.get(name);
        if (result == null) {
            result = new ShapeType(name);
            shapeTypes.put(name, result);
        }
        return result;
    }
}
