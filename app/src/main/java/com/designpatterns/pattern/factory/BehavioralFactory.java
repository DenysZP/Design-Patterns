package com.designpatterns.pattern.factory;

import com.designpatterns.pattern.model.behavioral.ChainOfResponsibility;
import com.designpatterns.pattern.model.behavioral.Command;
import com.designpatterns.pattern.model.behavioral.Iterator;
import com.designpatterns.pattern.model.behavioral.Mediator;
import com.designpatterns.pattern.model.behavioral.Memento;
import com.designpatterns.pattern.model.behavioral.Observer;
import com.designpatterns.pattern.model.behavioral.State;
import com.designpatterns.pattern.model.behavioral.Strategy;
import com.designpatterns.pattern.model.behavioral.TemplateMethod;
import com.designpatterns.pattern.model.behavioral.Visitor;

import java.util.Arrays;
import java.util.List;

public class BehavioralFactory implements PatternFactory {

    @Override
    public List<Pattern> createPatternList() {
        return Arrays.asList(new ChainOfResponsibility(), new Command(), new Iterator(),
                new Mediator(), new Memento(), new Observer(), new State(), new Strategy(),
                new TemplateMethod(), new Visitor());
    }
}
