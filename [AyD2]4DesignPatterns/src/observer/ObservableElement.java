/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class ObservableElement implements ObservableSubject {

    private ArrayList<Observer> observers;
    private String event, type, id;

    public ObservableElement() {
        observers = new ArrayList<Observer>();
    }

    public String getEvent() {
        return event;
    }

    public void eventDetected() {
        notifyObservers();
    }

    public void eventDescription(String event, String type, String id) {
        this.event = event;
        this.type = type;
        this.id = id;
        eventDetected();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(event, type, id);
        }
    }

}
