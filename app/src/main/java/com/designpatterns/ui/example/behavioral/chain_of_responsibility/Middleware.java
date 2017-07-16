package com.designpatterns.ui.example.behavioral.chain_of_responsibility;

public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next) {
        if (this.next == null) {
            this.next = next;
        } else {
            this.next.linkWith(next);
        }
        return this;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
