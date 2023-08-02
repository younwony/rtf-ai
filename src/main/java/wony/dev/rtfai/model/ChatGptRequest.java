package wony.dev.rtfai.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;
import wony.dev.rtfai.properties.ChatGptProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatGptRequest {
    private List<ChatGptMessage> messages;
    private final String model;
    @JsonProperty("max_tokens")
    private final int maxTokens;
    private double temperature;
    public static ChatGptRequest valueOf(AskRequest ask, ChatGptProperties properties) {
        List<ChatGptMessage> messages = new ArrayList<>();
        messages.add(ChatGptMessage.defaultMessage());

        if(!CollectionUtils.isEmpty(ask.getPreContent())) {
            ask.getPreContent().stream()
                    .map(ChatGptMessage::from)
                    .forEach(messages::add);
        }

        messages.add(ChatGptMessage.from(ask.getContent()));

        return ChatGptRequest.builder()
                .model(properties.getModel())
                .messages(messages)
                .temperature(properties.getTemperature())
                .maxTokens(properties.getMaxTokens())
                .build();
    }
}
