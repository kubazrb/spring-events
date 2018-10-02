package pl.wat.isi.pz.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import pl.wat.isi.pz.event.MyEvent;

@Component
public class MyListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("Received my event - " + event.getMessage());
    }
}

