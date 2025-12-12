package com.eric.langchain_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eric.langchain_demo.model.Weather;
import com.eric.langchain_demo.service.WeatherLoader;

import dev.langchain4j.model.chat.ChatLanguageModel;

@RestController
public class ChatController {

    ChatLanguageModel chatLanguageModel;
    
    @Autowired
    private WeatherLoader weatherLoader;

    public ChatController(ChatLanguageModel chatLanguageModel) {
        this.chatLanguageModel = chatLanguageModel;
    }

    @GetMapping("/chat")
    public String model(@RequestParam(value = "message", defaultValue = "Hello") String message) {
        return chatLanguageModel.chat(message);
    }
    
    
    @GetMapping("/provideweather")
    public String provideweather(@RequestParam(value = "message", defaultValue = "Hello") String message) {
    	
    	StringBuilder listOfWeather = new StringBuilder();
    	
    	List<Weather> weatherList;
		try {
			weatherList = weatherLoader.loadWeather();
			
			
			weatherList.forEach((weather -> listOfWeather.append(weather.toString()).append("\n")));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	        
	        
	        
        return chatLanguageModel.chat(message+"\n"+listOfWeather.toString());
    }
}