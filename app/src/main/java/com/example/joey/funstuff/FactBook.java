package com.example.joey.funstuff;

import java.util.Random;

/**
 * Created by Joey on 20/08/2014.
 */
public class FactBook {
    //Member Variable(properties of the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches are faster than horses.",
            "Olympic gold medals are made mostly of silver",
            "Born with 300 bones, adults have 206",
            "8 minutes for light from sun to reach Earth",
            "Florida is bigger than England",
            "Mammoths and the pyramids being built happened at same time",
            "Usually take 66 days to form a habit",
            "Some penguins can leap up to 3 meters out of water",
            "some bamboo grows over a meter in a day"
    };
    //Method(abilities; things object can do)
    public String getFact() {
        // The button was clicked so update the fact label with a new fact
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct new rand num generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        //Find the random number in our array
        fact = mFacts[randomNumber];

        return fact;
    }
}
