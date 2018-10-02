package pl.wat.isi.pz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.isi.pz.publisher.MyPublisher;

@RestController
@RequestMapping("/myEvents")
public class MyEventsController {

    @Autowired
    private MyPublisher publisher;

    @GetMapping("/publish")
    public void invokeEvents() {
        publisher.publish("My Custom Event Message");
    }
}
