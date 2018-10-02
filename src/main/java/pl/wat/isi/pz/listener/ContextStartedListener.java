package pl.wat.isi.pz.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;

@Component
public class ContextStartedListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("Received spring context started event - "
                + new Timestamp(event.getTimestamp()).toLocalDateTime());
    }
}
