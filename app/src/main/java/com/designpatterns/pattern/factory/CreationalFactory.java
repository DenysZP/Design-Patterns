package com.designpatterns.pattern.factory;

import com.designpatterns.pattern.model.creational.AbstractFactory;
import com.designpatterns.pattern.model.creational.Builder;
import com.designpatterns.pattern.model.creational.FactoryMethod;
import com.designpatterns.pattern.model.creational.PrototypePattern;
import com.designpatterns.pattern.model.creational.SingletonPattern;

import java.util.Arrays;
import java.util.List;

public class CreationalFactory implements PatternFactory {

    @Override
    public List<Pattern> createPatternList() {
        return Arrays.asList(new AbstractFactory(), new Builder(), new FactoryMethod(),
                new PrototypePattern(), new SingletonPattern());
    }
}
