package com.WhatsAppChatbot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WhatsAppChatbot.Model.Message;

@Repository
public interface MessageRepository extends JpaRepository <Message, Long>{

	
}
	

