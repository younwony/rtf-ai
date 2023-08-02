package wony.dev.rtfai.config;

import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wony.dev.rtfai.properties.ChatGptProperties;

@Configuration
@RequiredArgsConstructor
public class ChatGptClientConfiguration {

    private final ChatGptProperties chatGptProperties;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Authorization", "Bearer " + chatGptProperties.getApiKey());
        };
    }
}
