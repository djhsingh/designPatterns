package djh.learn.dP.observerDesignPattern.model;

import djh.learn.dP.observerDesignPattern.interfaces.Observer;
import djh.learn.dP.observerDesignPattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    private List<Observer> observerList;
    public String message;

    public EmailTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null){
            throw  new NullPointerException("No Observer Found");
        }
        if(!observerList.contains(observer))
            observerList.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    @Override
    public Object getUpdates(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to my Topic "+msg);
        this.message = msg;
        notifyObservers();
    }
}
