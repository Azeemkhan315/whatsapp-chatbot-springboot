package com.WhatsAppChatbot.Service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class WhatsAppService {

    private final String accessToken = "EAAKyZBL5vrtcBOz6zMcbIZCVVZAYpNTK0a92We7xCMktNoX8ZBV5HjYa0WlbdvXML4jhk4ACZAlyov1SDRAXSxNbyegsBmaO8utJZBlzDJG7mrc1AZBj8uEG0kyHZCHoH1roPBBDycs9y1fNWpIxo06tN1od6HElqSDGf9QtGIijvMG1yhupbTB1noKnBnZAWTBtXwAZBnJaZA17ktRe8419he5p3XaYEI7IuCVLCx0fjJUFNKH9QZDZD";
    private final String phoneNumberId = "751955281324160";

    public void sendMessage(String to, String textMessage) {
        String url = "https://graph.facebook.com/v19.0/" + phoneNumberId + "/messages";

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);

        Map<String, Object> body = new HashMap<>();
        body.put("messaging_product", "whatsapp");
        body.put("to", to);
        body.put("type", "text");
        body.put("text", Map.of("body", textMessage));

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(body, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
            System.out.println("Message sent successfully: " + response.getBody());
        } catch (Exception e) {
            System.out.println("Error sending message: " + e.getMessage());
        }
    }
}
