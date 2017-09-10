package com;

import com.example.user.music_store.instrumentPackage.Keyboard;
import com.example.user.music_store.instrumentPackage.instrumentType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/09/2017.
 */

public class KeyboardTest {

    @Test
    public void canPlay() {
        Keyboard piano = new Keyboard(instrumentType.KEYBOARD, "Piano", 130, 300, 88);
        assertEquals( "* Plays Comptine d'un autre été *", piano.play());
    }

    @Test
    public void hasName() {
        Keyboard piano = new Keyboard(instrumentType.KEYBOARD, "Piano", 130, 300, 88);
        assertEquals( "Piano", piano.getName() );
    }

    @Test
    public void getProfit() {
        Keyboard piano = new Keyboard(instrumentType.KEYBOARD, "Piano", 130, 300, 88);
        assertEquals( 170.00, piano.getProfit(), -0.1 );
    }
}
