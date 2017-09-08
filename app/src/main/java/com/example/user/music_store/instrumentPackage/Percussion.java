package com.example.user.music_store.instrumentPackage;

/**
 * Created by user on 08/09/2017.
 */

public class Percussion extends Instrument {

    private String skin;

    public Percussion(Enum<instrumentType> family,
                      String name,
                      int buyPrice,
                      int sellPrice,
                      String skin) {
        super(family,
                name,
                buyPrice,
                sellPrice);
        this.skin = skin;
    }

    public String play() {
        return "*Plays the Phil Collins - Coming In The Air Tonight drum solo!";
    }

    public String getSkin() {
        return skin;
    }

}
