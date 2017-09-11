package com.example.user.music_store.instrumentPackage;

import com.example.user.music_store.Sellable;

/**
 * Created by user on 10/09/2017.
 */

public class Miscellaneous implements Sellable {

    private Enum<instrumentType> family;
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Miscellaneous(String description, int buyPrice, int sellPrice, Enum<instrumentType> family) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.family = family;
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

    public double getProfit() {
        return sellPrice - buyPrice;
    }

    public Enum getFamily() {
        return family;
    }
}
