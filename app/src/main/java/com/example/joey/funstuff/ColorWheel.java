package com.example.joey.funstuff;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by ${Joey} on ${08/20/2014}.
 */
public class ColorWheel {
    //Member Variable(properties of the object)
    public String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#7d699e",
            "#E80CD9",
            "#FFF6EC",
            "#0DF3FF",
            "#D6FF65",
            "#E85BAF",
    };
    //Method(abilities; things object can do)
    public int getColor() {
        // The button was clicked so update the fact label with a new fact
        String color = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct new rand num generator
        int randomNumber = randomGenerator.nextInt(mColors.length);
        //Find the random number in our array
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
