package wony.dev.rtfai.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wony.dev.rtfai.config.ChatGptClientConfiguration;
import wony.dev.rtfai.model.ChatGptRequest;
import wony.dev.rtfai.model.ChatGptResponse;

@FeignClient(name = "chat-gpt", url = "${chat-gpt.endpoint}", configuration = ChatGptClientConfiguration.class)
public interface ChatGptClient {

    @RequestMapping(method = RequestMethod.POST)
    ChatGptResponse ask(ChatGptRequest request);
}
