package org.example;

public interface Observable {
    public  void subscribe(Observer o);
    public  void unsubsribe(Observer o);
    public void notifyObserver();
}
