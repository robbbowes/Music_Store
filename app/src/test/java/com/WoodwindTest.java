package com;

import com.example.user.music_store.instrumentPackage.Woodwind;
import com.example.user.music_store.instrumentPackage.WoodwindType;
import com.example.user.music_store.instrumentPackage.instrumentType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/09/2017.
 */

public class WoodwindTest {

    @Test
    public void canPlay() {
        Woodwind ocarina = new Woodwind(instrumentType.WOODWIND, "Ocarina of Time", 15, 30, WoodwindType.FLUTE);
        assertEquals( "* Toot toot *", ocarina.play());
    }

    @Test
    public void getWoodwindType() {
        Woodwind ocarina = new Woodwind(instrumentType.WOODWIND, "Ocarina of Time", 15, 30, WoodwindType.FLUTE);
        assertEquals( WoodwindType.FLUTE, ocarina.getWoodwindType());
    }

    @Test
    public void hasName() {
        Woodwind ocarina = new Woodwind(instrumentType.WOODWIND, "Ocarina of Time", 15, 30, WoodwindType.FLUTE);
        assertEquals( "Ocarina of Time", ocarina.getName() );
    }

    @Test
    public void getProfit() {
        Woodwind ocarina = new Woodwind(instrumentType.WOODWIND, "Ocarina of Time", 15, 30, WoodwindType.FLUTE);
        assertEquals(15.0, ocarina.getProfit(), -0.1);
    }
}
