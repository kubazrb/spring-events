package pl.wat.isi.pz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wat.isi.pz.publisher.MyPublisher;

@RestController
@RequestMapping("/springEvents")
public class SpringEventsController {

    @Autowired
    private ConfigurableApplicationContext context;
    @Autowired
    private MyPublisher publisher;

    @GetMapping("/publish")
    public void invokeEvents() {
        context.start();
        context.stop();
        context.start();
        context.close();
    }

    @GetMapping("/http")
    public ResponseEntity invokeHttp() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
