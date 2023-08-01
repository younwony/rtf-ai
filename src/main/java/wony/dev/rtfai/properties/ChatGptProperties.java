package wony.dev.rtfai.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "chat-gpt")
public class ChatGptProperties {

    private String endpoint;
    private String apiKey;
    private String model;
}
