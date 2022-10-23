package liga.medical.message.core.services;

import liga.medical.message.core.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RabbitSenderService {

    private final AmqpTemplate amqpTemplate;

    @Autowired
    public RabbitSenderService(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public ResponseEntity<String> sendMessage(String message) {
        amqpTemplate.convertAndSend(RabbitConfig.QUEUE_NAME, message);
        return ResponseEntity.ok("Сообщение доставлено в очередь coomone_monitoring");

    }
}
