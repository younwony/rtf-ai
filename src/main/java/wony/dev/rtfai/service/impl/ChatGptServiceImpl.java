package wony.dev.rtfai.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import wony.dev.rtfai.client.ChatGptClient;
import wony.dev.rtfai.model.AskRequest;
import wony.dev.rtfai.model.ChatGptRequest;
import wony.dev.rtfai.model.ChatGptResponse;
import wony.dev.rtfai.properties.ChatGptProperties;
import wony.dev.rtfai.service.ChatGptService;

@Slf4j
@Service
@RequiredArgsConstructor
public class ChatGptServiceImpl implements ChatGptService {

    private final ChatGptClient chatGptClient;
    private final ChatGptProperties chatGptProperties;
    @Override
    public ChatGptResponse ask(AskRequest ask) {
        ChatGptRequest chatGptRequest = ChatGptRequest.valueOf(ask, chatGptProperties);
        return chatGptClient.ask(chatGptRequest);
    }
}
