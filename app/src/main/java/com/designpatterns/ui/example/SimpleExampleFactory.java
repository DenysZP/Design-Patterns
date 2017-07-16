package com.designpatterns.ui.example;

import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;
import com.designpatterns.ui.example.behavioral.chain_of_responsibility.ChainOfResponsibilityExampleFragment;
import com.designpatterns.ui.example.behavioral.command.CommandEampleFragment;
import com.designpatterns.ui.example.behavioral.iterator.IteratorExampleFragment;
import com.designpatterns.ui.example.behavioral.mediator.MediatorExampleFragment;
import com.designpatterns.ui.example.behavioral.memento.MementoExampleFragment;
import com.designpatterns.ui.example.behavioral.observer.ObserverExampleFragment;
import com.designpatterns.ui.example.behavioral.state.StateExampleFragment;
import com.designpatterns.ui.example.behavioral.strategy.StrategyExampleFragment;
import com.designpatterns.ui.example.behavioral.template_method.TemplateMethodFragment;
import com.designpatterns.ui.example.behavioral.visitor.VisitorExampleFragment;
import com.designpatterns.ui.example.creational.abstract_factory.AbstractFactoryExampleFragment;
import com.designpatterns.ui.example.creational.builder.BuilderExampleFragment;
import com.designpatterns.ui.example.creational.factory_method.FactoryMethodExampleFragment;
import com.designpatterns.ui.example.creational.prototype.PrototypeExampleFragment;
import com.designpatterns.ui.example.creational.singleton.SingletonExampleFragment;
import com.designpatterns.ui.example.structural.adapter.AdapterExampleFragment;
import com.designpatterns.ui.example.structural.bridge.BridgeExampleFragment;
import com.designpatterns.ui.example.structural.composite.CompositeExampleFragment;
import com.designpatterns.ui.example.structural.decorator.DecoratorExampleFragment;
import com.designpatterns.ui.example.structural.facade.FacadeExampleFragment;
import com.designpatterns.ui.example.structural.flyweight.FlyweightExampleFragment;
import com.designpatterns.ui.example.structural.proxy.ProxyExampleFragment;

public class SimpleExampleFactory {

    @Nullable
    public Fragment getExampleFragment(Pattern pattern) {
        switch (pattern.getCategoryTitleResource()) {
            case R.string.category_creational_title:
                return getCreationalFragment(pattern.getTitleResource());
            case R.string.category_structural_title:
                return getStructuralFragment(pattern.getTitleResource());
            case R.string.category_behavioral_title:
                return getBehavioralFragment(pattern.getTitleResource());
            default:
                return null;
        }
    }

    @Nullable
    private Fragment getCreationalFragment(@StringRes int patternTitle) {

        switch (patternTitle) {
            case R.string.creational_abstract_factory_title:
                return new AbstractFactoryExampleFragment();
            case R.string.creational_builder_title:
                return new BuilderExampleFragment.Builder()
                        .setUserFirstName("Johnny")
                        .setUserSurname("Myers")
                        .setUserEmail("johnny.myers92@example.com")
                        .build();
            case R.string.creational_factory_method_title:
                return new FactoryMethodExampleFragment();
            case R.string.creational_prototype_title:
                return new PrototypeExampleFragment();
            case R.string.creational_singleton_title:
                return new SingletonExampleFragment();
            default:
                return null;
        }
    }

    @Nullable
    private Fragment getStructuralFragment(@StringRes int patternTitle) {

        switch (patternTitle) {
            case R.string.structural_adapter_title:
                return new AdapterExampleFragment();
            case R.string.structural_composite_title:
                return new CompositeExampleFragment();
            case R.string.structural_decorator_title:
                return new DecoratorExampleFragment();
            case R.string.structural_facade_title:
                return new FacadeExampleFragment();
            case R.string.structural_flyweight_title:
                return new FlyweightExampleFragment();
            case R.string.structural_proxy_title:
                return new ProxyExampleFragment();
            case R.string.structural_bridge_title:
                return new BridgeExampleFragment();
            default:
                return null;
        }
    }

    @Nullable
    private Fragment getBehavioralFragment(@StringRes int patternTitle) {

        switch (patternTitle) {
            case R.string.behavioral_observer_title:
                return new ObserverExampleFragment();
            case R.string.behavioral_iterator_title:
                return new IteratorExampleFragment();
            case R.string.behavioral_memento_title:
                return new MementoExampleFragment();
            case R.string.behavioral_chain_of_responsibility_title:
                return new ChainOfResponsibilityExampleFragment();
            case R.string.behavioral_visitor_title:
                return new VisitorExampleFragment();
            case R.string.behavioral_mediator_title:
                return new MediatorExampleFragment();
            case R.string.behavioral_strategy_title:
                return new StrategyExampleFragment();
            case R.string.behavioral_state_title:
                return new StateExampleFragment();
            case R.string.behavioral_command_title:
                return new CommandEampleFragment();
            case R.string.behavioral_template_method_title:
                return new TemplateMethodFragment();
            default:
                return null;
        }
    }
}
