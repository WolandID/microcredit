package ru.burenkov.verification.service;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.burenkov.verification.model.Application;

@Component
@RequiredArgsConstructor

public class ConsumerService {
    private final ApplicationService applicationService;

    @KafkaListener(topics = "requests")
    public void consume(@Payload Application application){
        applicationService.add(application);
    }
}
