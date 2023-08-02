package wony.dev.rtfai.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wony.dev.rtfai.model.AskRequest;
import wony.dev.rtfai.model.ChatGptRequest;
import wony.dev.rtfai.model.ChatGptResponse;
import wony.dev.rtfai.model.ChatGptRole;
import wony.dev.rtfai.properties.ChatGptProperties;

@SpringBootTest
class ChatGptClientTest {

    @Autowired
    private ChatGptClient chatGptClient;

    @Autowired
    private ChatGptProperties chatGptProperties;

    @Test
    @DisplayName("Ask Test")
    void askTest() {
        // given
        AskRequest askRequest = AskRequest.builder()
                .role(ChatGptRole.USER)
                .content("파 1개 양파 2개 당근 3")
                .build();
        ChatGptRequest chatGptRequest = ChatGptRequest.valueOf(askRequest, chatGptProperties);
        System.out.println("chatGptRequest = " + chatGptRequest);

        // expected
        ChatGptResponse response = chatGptClient.ask(chatGptRequest);
        System.out.println("response = " + response);
    }

}