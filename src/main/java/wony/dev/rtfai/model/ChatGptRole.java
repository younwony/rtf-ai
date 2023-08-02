package wony.dev.rtfai.model;

import lombok.Getter;

@Getter
public enum ChatGptRole {
    USER("user"),
    SYSTEM("system"),
    ASSISTANT("assistant")
    ;
    private final String str;
    ChatGptRole(String str) {
        this.str = str;
    }
}
