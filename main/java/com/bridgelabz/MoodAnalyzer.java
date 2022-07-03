package com.bridgelabz;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        if (message.contains("I am in sad mood"))
            return "SAD";
        else
            return "HAPPY";
    }
}
