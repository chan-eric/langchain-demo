//package com.eric.langchain_demo.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import dev.langchain4j.model.chat.ChatLanguageModel;
//
//@RestController
//public class ChatController {
//
//    ChatLanguageModel chatLanguageModel;
//
//    public ChatController(ChatLanguageModel chatLanguageModel) {
//        this.chatLanguageModel = chatLanguageModel;
//    }
//
//    @GetMapping("/chat")
//    public String model(@RequestParam(value = "message", defaultValue = "Hello") String message) {
//        return chatLanguageModel.chat(message);
//    }
//}