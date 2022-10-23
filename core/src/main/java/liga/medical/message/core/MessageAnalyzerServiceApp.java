package liga.medical.message.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("liga.medical.message")
public class MessageAnalyzerServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(MessageAnalyzerServiceApp.class, args);
    }

}
