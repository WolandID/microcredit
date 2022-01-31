package ru.burenkov.reception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.burenkov.reception.model.Application;
import ru.burenkov.reception.service.ProducerService;

@RestController
public class SendController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/requests")
    public String sendRequest(@RequestBody Application application){
        producerService.produce(application);
        return "Send application to vertification";
    }
}
