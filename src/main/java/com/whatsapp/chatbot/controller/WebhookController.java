package com.whatsapp.chatbot.controller;



import com.whatsapp.chatbot.dto.MessageRequestDTO;
import com.whatsapp.chatbot.dto.MessageResponseDTO;
import com.whatsapp.chatbot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public MessageResponseDTO receiveMessage(@RequestBody MessageRequestDTO request) {

        System.out.println("Received message: " + request.getMessage());

        return messageService.processMessage(request);
    }
}