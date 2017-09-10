package com;

import com.example.user.music_store.instrumentPackage.Stringed;
import com.example.user.music_store.instrumentPackage.instrumentType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/09/2017.
 */

public class StringedTest {

    @Test
    public void canPlay() {
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        assertEquals( "Plays a sick solo!", bassGuitar.play() );
    }

    @Test
    public void hasName() {
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        assertEquals( "Bass Guitar", bassGuitar.getName() );
    }

    @Test
    public void hasBuyPrice() {
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        assertEquals( 60, bassGuitar.getBuyPrice() );
    }

    @Test
    public void hasSellPrice() {
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        assertEquals( 90, bassGuitar.getSellPrice() );
    }

    @Test
    public void hasStrings() {
        Stringed bassGuitar = new Stringed(instrumentType.STRINGED, "Bass Guitar", 60, 90, 4);
        assertEquals( 4, bassGuitar.getNumOfStrings() );
    }
}