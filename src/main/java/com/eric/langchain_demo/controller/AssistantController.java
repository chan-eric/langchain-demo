package com.eric.langchain_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.langchain_demo.service.Assistant;

@RestController
public class AssistantController {

	@Autowired
    Assistant assistant;

   
    @GetMapping("/chat")
    public String chat(String message) {
        return assistant.chat(message);
    }
}