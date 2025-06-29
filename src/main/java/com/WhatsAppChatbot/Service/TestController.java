package com.WhatsAppChatbot.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private WhatsAppService whatsAppService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody Map<String, String> payload) {
        String to = payload.get("to");
        String msg = payload.get("message");

        whatsAppService.sendMessage(to, msg);

        return ResponseEntity.ok("✅ Message sent to " + to);
    }
}

