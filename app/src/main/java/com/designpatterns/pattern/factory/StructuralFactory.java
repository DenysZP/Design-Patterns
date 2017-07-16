package com.designpatterns.pattern.factory;

import com.designpatterns.pattern.model.structural.Adapter;
import com.designpatterns.pattern.model.structural.Bridge;
import com.designpatterns.pattern.model.structural.Composite;
import com.designpatterns.pattern.model.structural.Decorator;
import com.designpatterns.pattern.model.structural.Facade;
import com.designpatterns.pattern.model.structural.Flyweight;
import com.designpatterns.pattern.model.structural.Proxy;

import java.util.Arrays;
import java.util.List;

public class StructuralFactory implements PatternFactory {

    @Override
    public List<Pattern> createPatternList() {
        return Arrays.asList(new Adapter(), new Bridge(), new Composite(), new Decorator(),
                new Facade(), new Flyweight(), new Proxy());
    }
}
