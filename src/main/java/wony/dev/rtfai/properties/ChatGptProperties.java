package wony.dev.rtfai.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "chat-gpt")
public class ChatGptProperties {
    private String endpoint;
    private String apiKey;
    private String model;
    private String temperature;
    private String maxTokens;

    public Double getTemperature() {
        return Double.parseDouble(temperature);
    }

    public Integer getMaxTokens() {
        return Integer.parseInt(maxTokens);
    }
}
