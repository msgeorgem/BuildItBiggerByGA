package com.example.jokewizardjava;

import java.util.Random;

public class JokeWizardJava {


    private String[] jokes;
    private Random random;

    public JokeWizardJava() {
        jokes = new String[3];
        jokes[0] = "Why is it so hard for a leopard to hide? \n Because is always spotted.";
        jokes[1] = "Q. What does a dolphin say when he’s confused?\n" +
                "A. Can you please be more Pacific?\n";
        jokes[2] = "Q: What is a Queens favorite kind of precipitation?\n" +
                "\n" + "A: Reign!\n";
        random = new Random();
    }


    public String tellAHandCraftedJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
