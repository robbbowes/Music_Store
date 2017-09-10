package com.example.user.music_store.instrumentPackage;

import com.example.user.music_store.Sellable;

import java.util.ArrayList;

/**
 * Created by user on 10/09/2017.
 */

public class Shop {

    private String shopName;
    ArrayList<Sellable> stock;

    public Shop(String shopName, ArrayList<Sellable> stock) {
        this.shopName = shopName;
        this.stock = stock;
    }

    public String getShopName() {
        return this.shopName;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addToStock(Sellable item) {
        this.stock.add(item);
    }

    public Sellable viewFirstItem() {
        return this.stock.get(0);
    }

    public ArrayList<Sellable> viewStock() {
        return this.stock;
    }

    public void removeFromStock(int index) {
        this.stock.remove(index);
    }

    public void removeFromStockByType(Enum instrumentType) {
        for (Sellable item : this.stock) {
            if (item.getFamily().equals(instrumentType)) {
                this.stock.remove(item);
            }
        }
    }
}

//    public ArrayList<Integer> viewSellablePrices() {
//        for( int index = stock.size() - 1; index >= 0; index++ ) {
//            this.stock.get(index).getSellPrice();
//        }
//    }