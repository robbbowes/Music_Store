package com;

import com.example.user.music_store.instrumentPackage.Miscellaneous;
import com.example.user.music_store.instrumentPackage.instrumentType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/09/2017.
 */

public class MiscellaneousTest {

    @Test
    public void hasDescription() {
        Miscellaneous pianosheetmusic = new Miscellaneous( "Piano sheet music for beginners", 5, 12, instrumentType.MISCELLANEOUS );
        assertEquals( "Piano sheet music for beginners", pianosheetmusic.getDescription() );
    }

    @Test
    public void getProfit() {
        Miscellaneous pianosheetmusic = new Miscellaneous( "Piano sheet music for beginners", 5, 12, instrumentType.MISCELLANEOUS );
        assertEquals( 7.00, pianosheetmusic.getProfit(), -0.1 );
    }

    @Test
    public void getBuyPrice() {
        Miscellaneous pianosheetmusic = new Miscellaneous( "Piano sheet music for beginners", 5, 12, instrumentType.MISCELLANEOUS );
        assertEquals( 5, pianosheetmusic.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        Miscellaneous pianosheetmusic = new Miscellaneous( "Piano sheet music for beginners", 5, 12, instrumentType.MISCELLANEOUS );
        assertEquals( 12, pianosheetmusic.getSellPrice());
    }

    @Test
    public void getFamily() {
        Miscellaneous pianosheetmusic = new Miscellaneous( "Piano sheet music for beginners", 5, 12, instrumentType.MISCELLANEOUS );
        assertEquals( instrumentType.MISCELLANEOUS, pianosheetmusic.getFamily() );
    }

}
