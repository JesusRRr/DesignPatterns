package com.rolon.behavioral.observer;

public interface Observable {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObserver();

}
