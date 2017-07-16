package com.designpatterns.ui.example.behavioral.mediator;

public interface UiComponent {

    void setMediator(Mediator mediator);

    String getName();
}
