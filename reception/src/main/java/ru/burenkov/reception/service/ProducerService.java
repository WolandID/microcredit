package ru.burenkov.reception.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.burenkov.reception.model.Application;

@Component
@AllArgsConstructor
public class ProducerService {

private KafkaTemplate<String,Application> producer;

public void produce(Application application){
    producer.send("requests",application);
}
}
