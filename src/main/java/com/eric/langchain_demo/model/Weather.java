package com.eric.langchain_demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class Weather {
    
    private LocalDate date;
    
    @JsonProperty("temperature_celsius")
    private int temperatureCelsius;
    
    private String condition;

    // Getters and setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date=" + date +
                ", temperatureCelsius=" + temperatureCelsius +
                ", condition='" + condition + '\'' +
                '}';
    }
}