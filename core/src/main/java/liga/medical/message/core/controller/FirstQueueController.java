package liga.medical.message.core.controller;

import liga.medical.message.core.services.RabbitSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class FirstQueueController {

    private final RabbitSenderService rabbitSenderService;

    @Autowired
    public FirstQueueController(RabbitSenderService rabbitSenderService) {
        this.rabbitSenderService = rabbitSenderService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> rabbitcontroler(@RequestBody String message) {
        return rabbitSenderService.sendMessage(message);
    }
}
