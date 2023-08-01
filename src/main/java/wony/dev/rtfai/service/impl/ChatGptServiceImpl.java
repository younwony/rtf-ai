package wony.dev.rtfai.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wony.dev.rtfai.model.AskRequest;
import wony.dev.rtfai.model.ChatGptResponse;
import wony.dev.rtfai.properties.ChatGptProperties;
import wony.dev.rtfai.service.ChatGptService;

@Service
@RequiredArgsConstructor
public class ChatGptServiceImpl implements ChatGptService {

    private final ChatGptProperties chatGptProperties;
    @Override
    public ChatGptResponse ask(AskRequest question) {
        return null;
    }
}
