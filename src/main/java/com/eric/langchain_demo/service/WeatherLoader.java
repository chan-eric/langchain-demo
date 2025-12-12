package com.eric.langchain_demo.service;

import com.eric.langchain_demo.model.Weather;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class WeatherLoader {

    public List<Weather> loadWeather() throws Exception {
        // Create ObjectMapper and register the JavaTimeModule for LocalDate support
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        
        // Load the JSON file from the classpath
        ClassPathResource resource = new ClassPathResource("data.json");
        InputStream inputStream = resource.getInputStream();
        
        // Parse JSON into a List of Weather objects
        List<Weather> weatherList = objectMapper.readValue(inputStream, new TypeReference<List<Weather>>() {});
        return weatherList;
    }
}