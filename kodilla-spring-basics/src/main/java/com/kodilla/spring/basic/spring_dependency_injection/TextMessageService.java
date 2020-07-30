package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class TextMessageService implements MessageService{
    @Override
    public String send(String message, String receiver) {
        return "Sending text [" + message + "] to: " + receiver;
    }
}
