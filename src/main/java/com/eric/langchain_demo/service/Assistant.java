package com.eric.langchain_demo.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService(chatModel = "chatLanguageModel")
public interface Assistant {

    @SystemMessage("You are a polite assistant")
    String chat(String userMessage);
}