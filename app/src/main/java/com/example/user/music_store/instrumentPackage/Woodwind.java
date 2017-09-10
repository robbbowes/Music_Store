package com.example.user.music_store.instrumentPackage;

/**
 * Created by user on 10/09/2017.
 */

public class Woodwind extends Instrument {

    private Enum<WoodwindType> woodwindType;

    public Woodwind(Enum<instrumentType> family,
                    String name,
                    int buyPrice,
                    int sellPrice,
                    Enum<WoodwindType> woodwindType) {
        super(family,
                name,
                buyPrice,
                sellPrice);
        this.woodwindType = woodwindType;
    }

    public String play() {
        return "* Toot toot *";
    }

    public Enum<WoodwindType> getWoodwindType() {
        return woodwindType;
    }

}
