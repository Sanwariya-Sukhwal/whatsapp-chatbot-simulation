package com.whatsapp.chatbot.service;

import com.whatsapp.chatbot.dto.MessageRequestDTO;
import com.whatsapp.chatbot.dto.MessageResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public MessageResponseDTO processMessage(MessageRequestDTO request) {

        String msg = request.getMessage();

        if (msg.equalsIgnoreCase("Hi")) {
            return new MessageResponseDTO("Hello");
        } else if (msg.equalsIgnoreCase("Bye")) {
            return new MessageResponseDTO("Goodbye");
        } else {
            return new MessageResponseDTO("I didn't understand");
        }
    }
}