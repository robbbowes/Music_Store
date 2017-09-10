package com;

import com.example.user.music_store.instrumentPackage.instrumentType;
import com.example.user.music_store.instrumentPackage.Percussion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/09/2017.
 */

public class PercussionTest {

    @Test
    public void canGetSkins() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( "Special skins", drumkit.getSkin() );
    }

    @Test
    public void canPlay() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( "*Plays the Phil Collins - Coming In The Air Tonight drum solo!", drumkit.play() );
    }

    @Test
    public void hasName() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( "Drumkit with flames", drumkit.getName());
    }

    @Test
    public void hasBuyPrice() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( 130, drumkit.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( 300, drumkit.getSellPrice());
    }

    @Test
    public void getProfit() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( 170.00, drumkit.getProfit(), -0.1 );
    }

    @Test
    public void getFamily() {
        Percussion drumkit = new Percussion(instrumentType.PERCUSSION, "Drumkit with flames", 130, 300, "Special skins");
        assertEquals( instrumentType.PERCUSSION, drumkit.getFamily());
    }
}
