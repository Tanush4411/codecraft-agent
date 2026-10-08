package com.chrizlove.intelligence_service.service;

import com.chrizlove.intelligence_service.chat.StreamResponse;
import reactor.core.publisher.Flux;

public interface AiGenerationService {
    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
