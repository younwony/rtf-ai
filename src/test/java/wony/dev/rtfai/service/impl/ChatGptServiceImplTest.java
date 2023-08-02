package wony.dev.rtfai.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ChatGptServiceImplTest {

    private RestTemplate restTemplate = new RestTemplate();

    @BeforeEach
    void setUp() {
        restTemplate.getForEntity("http://localhost:8080/openai/ask", String.class);
    }
  
}