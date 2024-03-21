package djh.learn.dP.observerDesignPattern.model;

import djh.learn.dP.observerDesignPattern.interfaces.Observer;
import djh.learn.dP.observerDesignPattern.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    private Subject topic;
    @Override
    public void update() {
        String msg = (String) topic.getUpdates(this);
        if(msg == null){
            System.out.println(name+" No message was found");
        } else{
            System.out.println(name+" Retrived message is: "+msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic= subject;
    }
}
