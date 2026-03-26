package com.whatsapp.chatbot.dto;

public class MessageResponseDTO {

    private String reply;

    public MessageResponseDTO() {
    }

    public MessageResponseDTO(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}