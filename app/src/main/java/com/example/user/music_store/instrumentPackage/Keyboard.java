package com.example.user.music_store.instrumentPackage;

/**
 * Created by user on 08/09/2017.
 */

public class Keyboard extends Instrument {

    int numOfKeys;

    public Keyboard(Enum<instrumentType> family,
                    String name,
                    int buyPrice,
                    int sellPrice,
                    int numOfKeys) {
        super(family,
                name,
                buyPrice,
                sellPrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public String play() {
        return "* Plays Comptine d'un autre été *";
    }
}
