package com.designpatterns.ui.example.creational.prototype;

import android.support.annotation.NonNull;

public class ConstructorPrototypeExample {

    private int exampleIntegerValue;
    private String exampleStringValue;

    public ConstructorPrototypeExample(int exampleIntegerValue, String exampleStringValue) {
        this.exampleIntegerValue = exampleIntegerValue;
        this.exampleStringValue = exampleStringValue;
    }

    public ConstructorPrototypeExample(@NonNull ConstructorPrototypeExample target) {
        exampleIntegerValue = target.getExampleIntegerValue();
        exampleStringValue = target.getExampleStringValue();
    }

    public ConstructorPrototypeExample cloneObject() {
        return new ConstructorPrototypeExample(this);
    }

    public int getExampleIntegerValue() {
        return exampleIntegerValue;
    }

    public String getExampleStringValue() {
        return exampleStringValue;
    }

    @Override
    public String toString() {
        return "ConstructorPrototypeExample{" +
                "exampleIntegerValue=" + exampleIntegerValue +
                ", exampleStringValue='" + exampleStringValue + "\'" +
                ", hashCode=" + hashCode() + '}';
    }
}
