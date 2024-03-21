package djh.learn.dP.observerDesignPattern;

import djh.learn.dP.observerDesignPattern.interfaces.Observer;
import djh.learn.dP.observerDesignPattern.model.EmailTopic;
import djh.learn.dP.observerDesignPattern.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("First Observer");
        Observer secondObserver = new EmailTopicSubscriber("Second Observer");
        Observer thirdObserver = new EmailTopicSubscriber("Third Observer");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        firstObserver.update();
        secondObserver.update();
        topic.postMessage("First Message");
        firstObserver.update();
        topic.postMessage("Second Message");
    }
}
