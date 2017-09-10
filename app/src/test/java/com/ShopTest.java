package com;

import com.example.user.music_store.Sellable;
import com.example.user.music_store.instrumentPackage.Percussion;
import com.example.user.music_store.instrumentPackage.Shop;
import com.example.user.music_store.instrumentPackage.Stringed;
import com.example.user.music_store.instrumentPackage.instrumentType;

import org.junit.Before;
import org.junit.Test;
import static java.util.Arrays.asList;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by user on 10/09/2017.
 */

public class ShopTest {

    @Before
    public void before(){

    }

    @Test
    public void viewFirstItem() {
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        Shop shop = new Shop("Robb's Records", new ArrayList<Sellable>());
        shop.addToStock(bassGuitar);
        assertEquals( bassGuitar, shop.viewFirstItem() );
    }

    @Test
    public void stockcount() {
        Shop shop = new Shop("Robb's Records", new ArrayList<Sellable>() );
        assertEquals( 0, shop.getStock().size() );
    }

    @Test
    public void canAddStock() {
        Shop shop = new Shop("Robb's Records", new ArrayList<Sellable>() );
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        shop.addToStock(bassGuitar);
        shop.addToStock(drumkit);
        assertEquals( 2, shop.getStock().size() );
    }

    @Test
    public void canRemoveStock() {
        Shop shop = new Shop("Robb's Records", new ArrayList<Sellable>() );
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        shop.addToStock(bassGuitar);
        shop.addToStock(drumkit);
        assertEquals( 2, shop.getStock().size() );
        shop.removeFromStock(1);
        assertEquals( 1, shop.getStock().size() );
    }

    @Test
    public void canRemoveFromStockByType() {
        Shop shop = new Shop("Robb's Records", new ArrayList<Sellable>() );
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        shop.addToStock(bassGuitar);
        shop.addToStock(drumkit);
        assertEquals( 2, shop.getStock().size() );
//        shop.removeFromStockByType(instrumentType.PERCUSSION);
//        assertEquals( 1, shop.getStock().size() );
    }



//    @Test
//    public void canGetSellPrices() {
//        Shop shop = new Shop("Robb's Records", new ArrayList<Sellable>() );
//        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
//        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
//        shop.addToStock(bassGuitar);
//        shop.addToStock(drumkit);
//        assertEquals( <90, 300>,  )
//    }


}
