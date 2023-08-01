package wony.dev.rtfai.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wony.dev.rtfai.model.AskRequest;
import wony.dev.rtfai.service.ChatGptService;

@RequestMapping("/openai")
@RequiredArgsConstructor
@RestController
public class OpenAiController {

    private final ChatGptService chatgptService;

    @PostMapping("/ask")
    private ResponseEntity ask(@RequestBody AskRequest question) {
        return ResponseEntity.ok(chatgptService.ask(question));
    }
}
