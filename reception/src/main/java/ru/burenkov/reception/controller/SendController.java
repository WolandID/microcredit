package ru.burenkov.reception.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.burenkov.reception.model.Application;
import ru.burenkov.reception.service.ProducerService;

@RestController
@RequiredArgsConstructor
public class SendController {


    private final ProducerService producerService;

    @PostMapping("/requests")
    public String sendRequest(@RequestBody Application application){
        producerService.produce(application);
        return "Send application to verification";
    }
}
