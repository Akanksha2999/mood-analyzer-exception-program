package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    private MoodAnalyzer moodAnalyzer = new MoodAnalyzer();


    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        String mood = moodAnalyzer.analyzeMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        String mood = moodAnalyzer.analyzeMood("I am in any mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
