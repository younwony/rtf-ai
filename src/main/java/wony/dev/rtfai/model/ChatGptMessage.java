package wony.dev.rtfai.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class ChatGptMessage {

    private final String role;
    private final String content;

    private static final String SYSTEM_ROLE = "너는 이제 요리사야. 재료를 제시 하면 레시피를 알려줘";
    public static ChatGptMessage defaultMessage() {
        return ChatGptMessage.builder()
                .role(ChatGptRole.SYSTEM.getStr())
                .content(SYSTEM_ROLE)
                .build();
    }

    public static ChatGptMessage from(String content) {
        return ChatGptMessage.builder()
                .role(ChatGptRole.USER.getStr())
                .content(content)
                .build();
    }
}
