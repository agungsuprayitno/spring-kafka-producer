package springboot.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import springboot.kafka.producer.service.PublishMessageService;

@RestController
public class KafkaController {

    private final PublishMessageService publishMessageService;

    public KafkaController(PublishMessageService publishMessageService) {this.publishMessageService = publishMessageService;}

    @PostMapping("/publish-message")
    @ResponseStatus(HttpStatus.CREATED)
    public void PublishMessage(@RequestBody String message){
        publishMessageService.sendMessage(message);
    }
}
