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
}
