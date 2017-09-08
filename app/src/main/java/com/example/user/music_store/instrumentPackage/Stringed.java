package com.example.user.music_store.instrumentPackage;

/**
 * Created by user on 08/09/2017.
 */

public class Stringed extends Instrument{

    private int numOfStrings;

    public Stringed(Enum<instrumentType> family,
                    String name,
                    int buyPrice,
                    int sellPrice,
                    int numOfStrings) {
        super(family,
                name,
                buyPrice,
                sellPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }

    public String play() {
        return "Plays a sick solo!";
    }
}
