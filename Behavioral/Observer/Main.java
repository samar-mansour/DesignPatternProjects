package com.samar;

import com.samar.interfaces.Observer;
import com.samar.model.EmailTopic;
import com.samar.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");
        Observer fourthObserver = new EmailTopicSubscriber("FourthObserver");
        Observer fifthObserver = new EmailTopicSubscriber("FifthObserver");
        Observer sixthObserver = new EmailTopicSubscriber("SixthObserver");

        //Register them...
        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);
        emailTopic.register(fourthObserver);
        emailTopic.register(fifthObserver);
        emailTopic.register(sixthObserver);

        // Attaching observer to subject
        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);
        fourthObserver.setSubject(emailTopic);
        fifthObserver.setSubject(emailTopic);
        sixthObserver.setSubject(emailTopic);

        // Check for Updates
        firstObserver.update();
        thirdObserver.update();

        // Providers/ Subject (broadcaster)
        emailTopic.postMessage("Hello Subscribers!");

        emailTopic.unregister(firstObserver);

        emailTopic.postMessage("Hello Subscribers! new updates");



    }
}
