package pl.wat.isi.pz.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.wat.isi.pz.event.MyEvent;

import java.sql.Timestamp;

@Component
public class ContextClosedListener {

    @EventListener({ContextClosedEvent.class, MyEvent.class})
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Received spring context closed event or my event - "
                + new Timestamp(event.getTimestamp()).toLocalDateTime());
    }
}
