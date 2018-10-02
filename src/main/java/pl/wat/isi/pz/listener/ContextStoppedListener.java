package pl.wat.isi.pz.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;

@Component
public class ContextStoppedListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextStoppedEvent) {
            System.out.println("Received spring context stopped event - "
                    + new Timestamp(event.getTimestamp()).toLocalDateTime());
        }
    }
}
