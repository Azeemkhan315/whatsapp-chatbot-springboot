package com.WhatsAppChatbot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WhatsAppChatbot.Model.Message;
import com.WhatsAppChatbot.Service.ChatService;

@RestController
public class ChatController {
	
	@Autowired
	ChatService chatService;
	
	@PostMapping("/message")
    public ResponseEntity<String> receiveMessage(@RequestBody Message msg) {
        String reply = chatService.reply(msg.getUserText(), msg.getText());
        return ResponseEntity.ok(reply);
    }
}

