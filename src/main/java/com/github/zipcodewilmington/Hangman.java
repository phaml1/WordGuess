package com.github.zipcodewilmington;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    //Loc Pham
    String[] words;

    public Hangman(String[] words){
        this.words = words;
    }

    public static String getRandom(String[] words){
        Random random = new Random();
        int randIndex = random.nextInt(5);
        String randomWord = words[randIndex];
        //System.out.println(randomWord);
        return randomWord;
    }
    public Integer setTries(){
        return getRandom(words).length();
    }

    public Character[] setChar(Character[] spaces){
        String randomWord = getRandom(words);
        for(int i = 0; i < randomWord.length(); i++){

        }

        return null;
    }
}
