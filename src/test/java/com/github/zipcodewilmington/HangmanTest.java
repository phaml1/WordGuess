package com.github.zipcodewilmington;
import org.junit.Test;
import org.junit.Assert;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class HangmanTest {

    @Test
    public void getRandomWordTest(){
        String[] words = {"word","dog","like","teeth","trap"};
        Hangman hangman = new Hangman(words);
        String expected = hangman.getRandom(words);
        Assert.assertNotNull(expected);
    }

    @Test
    public void setTriesTest(){
        String[] words = {"word","dog","like","teeth","trap"};
        Hangman hangman = new Hangman(words);
        int expected = hangman.setTries();
        Assert.assertTrue(expected > 1 && expected < 6);
    }
}
