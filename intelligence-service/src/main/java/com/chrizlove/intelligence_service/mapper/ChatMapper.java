package com.chrizlove.intelligence_service.mapper;

import com.chrizlove.intelligence_service.chat.ChatResponse;
import com.chrizlove.intelligence_service.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
