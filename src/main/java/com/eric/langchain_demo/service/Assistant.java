package com.eric.langchain_demo.service;

//@AiService
interface Assistant {

    //@SystemMessage("You are a polite assistant")
    String chat(String userMessage);
}