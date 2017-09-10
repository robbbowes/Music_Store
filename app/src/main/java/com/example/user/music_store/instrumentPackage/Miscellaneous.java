package com.example.user.music_store.instrumentPackage;

import com.example.user.music_store.Sellable;

/**
 * Created by user on 10/09/2017.
 */

public abstract class Miscellaneous implements Sellable {

    String description;
    int buyPrice;
    int sellPrice;

    public Miscellaneous(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
