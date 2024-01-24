package springboot.kafka.producer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.kafka.producer.service.PublishMessageService;

@Configuration
public class RestConfiguration {

    @Bean
    public PublishMessageService publishMessageService() {
        return new PublishMessageService();
    }
}
