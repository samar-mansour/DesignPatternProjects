package com.samar.model;

import com.samar.interfaces.Observer;
import com.samar.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observerList;
    private String message;

    public EmailTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null)
            throw new NullPointerException("Null object/Observer");

        if(!observerList.contains(observer))
            observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to my topic : " + msg);
        this.message = msg;
        notifyObservers();
    }
}
