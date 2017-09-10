package com.example.user.music_store;

import com.example.user.music_store.instrumentPackage.instrumentType;

/**
 * Created by user on 08/09/2017.
 */

public interface Sellable {
    public double getProfit();

    int getSellPrice();

    int getBuyPrice();

    Enum<instrumentType> getFamily();

//    enum getFamily();

}
