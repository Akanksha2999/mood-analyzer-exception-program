package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmptyMood_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
            System.out.println("Empty mood");
        }
    }
}
