package wony.dev.rtfai.service;

import wony.dev.rtfai.model.AskRequest;
import wony.dev.rtfai.model.ChatGptResponse;

public interface ChatGptService {

    ChatGptResponse ask(AskRequest question);
}
