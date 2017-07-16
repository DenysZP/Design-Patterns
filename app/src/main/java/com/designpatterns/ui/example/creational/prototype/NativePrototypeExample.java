package com.designpatterns.ui.example.creational.prototype;

public class NativePrototypeExample implements Cloneable {

    private int exampleIntegerValue;
    private String exampleStringValue;

    public NativePrototypeExample(int exampleIntegerValue, String exampleStringValue) {
        this.exampleIntegerValue = exampleIntegerValue;
        this.exampleStringValue = exampleStringValue;
    }

    public int getExampleIntegerValue() {
        return exampleIntegerValue;
    }

    public String getExampleStringValue() {
        return exampleStringValue;
    }

    @Override
    protected NativePrototypeExample clone() throws CloneNotSupportedException {
        return (NativePrototypeExample) super.clone();
    }

    @Override
    public String toString() {
        return "NativePrototypeExample{" +
                "exampleIntegerValue=" + exampleIntegerValue +
                ", exampleStringValue='" + exampleStringValue + '\'' +
                ", hashCode=" + hashCode() + '}';
    }
}
