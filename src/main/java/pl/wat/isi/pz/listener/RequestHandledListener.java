package pl.wat.isi.pz.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

import java.sql.Timestamp;

@Component
public class RequestHandledListener {

    @EventListener(condition = "#event.wasFailure() == false")
    public void onRequestHandledEvent(RequestHandledEvent event) {
        System.out.println("Received request handled event - "
                + new Timestamp(event.getTimestamp()).toLocalDateTime());
        System.out.println(event + "; wasFailure=" + event.wasFailure());
    }
}
