package pl.wat.isi.pz.listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;

@Component
public class ContextRefreshedListener {

    @EventListener
    public void onContextRefreshedEvent(ContextRefreshedEvent event) {
        System.out.println("Received spring context refreshed event - "
                + new Timestamp(event.getTimestamp()).toLocalDateTime());
    }
}
