package com.Relay.app.controller;

import com.Relay.app.Entity.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/SendMessages")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(@Payload ChatMessage message) {
        System.out.println("Received message from: " + message.getSender() + " => " + message.getContent());
        return message;
    }

    @GetMapping("/chat")
    public String chat()
    {
        return "chat";
    }



}
