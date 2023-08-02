package wony.dev.rtfai.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatGptResponse {
    private String id;
    private String object;
    private String created;
    private String model;
    private List<Choices> choices;
    private Usage usage;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Choices {
        private String index;
        private ChatGptMessage message;
        @JsonProperty("finish_reason")
        private String finishReason;

        public static Choices defaultChoices() {
            return Choices.builder()
                    .index("")
                    .message(ChatGptMessage.builder()
                            .role("")
                            .content("")
                            .build())
                    .finishReason("")
                    .build();
        }
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Usage {
        @JsonProperty("prompt_tokens")
        private String promptTokens;
        @JsonProperty("completion_tokens")
        private String completionTokens;
        @JsonProperty("total_tokens")
        private String totalTokens;

        public static Usage defaultUsage() {
            return Usage.builder()
                    .promptTokens("")
                    .completionTokens("")
                    .totalTokens("")
                    .build();
        }
    }

    public static ChatGptResponse defaultResponse() {
        return ChatGptResponse.builder()
                .id("")
                .object("")
                .created("")
                .model("")
                .choices(List.of(Choices.defaultChoices()))
                .usage(Usage.defaultUsage())
                .build();
    }
}
