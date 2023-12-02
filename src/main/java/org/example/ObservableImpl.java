package org.example;
import java.util.ArrayList;
import java.util.List;
public class ObservableImpl implements Observable {
    private int state=10;
    private List<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer o) {
        this.observers.add(o);
    }
    @Override
    public void unsubsribe(Observer o) {
        this.observers.remove(o);
    }
    public void setState(int state) {
        this.state = state;
        this.notifyObserver();
    }
    public int getState() {
        return state;
    }
    @Override
    public void notifyObserver() {
        for (Observer o:observers){
            o.update(this.state);
        }
    }
}
