package com.chrizlove.intelligence_service.service;

import com.chrizlove.intelligence_service.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
