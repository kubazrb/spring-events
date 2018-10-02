package pl.wat.isi.pz.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import pl.wat.isi.pz.event.MyEvent;

@Component
public class MyPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String message) {
        System.out.println("Publishing my event. ");
        MyEvent myEvent = new MyEvent(this, message);
        applicationEventPublisher.publishEvent(myEvent);
    }
}
