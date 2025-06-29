package com.WhatsAppChatbot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WhatsAppChatbot.Model.Message;
import com.WhatsAppChatbot.Repository.MessageRepository;

@Service
public class ChatService {

    @Autowired
    private MessageRepository repo;

    public String reply(String from, String text) {
        Message msg = new Message();
        msg.setUserText(from);
        msg.setText(text);
        repo.save(msg);
        return "Message Saved!";
    }
}

