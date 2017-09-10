package com.example.user.music_store.instrumentPackage;

import com.example.user.music_store.Playable;
import com.example.user.music_store.Sellable;

/**
 * Created by user on 08/09/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    Enum<instrumentType> family;
    String name;
    int buyPrice;
    int sellPrice;

    public Instrument(Enum<instrumentType> family, String name, int buyPrice, int sellPrice){
        this.family = family;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Enum<instrumentType> getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return "What a lovely sound!";
    }

    public double getProfit() {
        return sellPrice - buyPrice;
    }

}
