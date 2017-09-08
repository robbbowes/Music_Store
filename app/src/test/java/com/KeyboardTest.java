package com;

import com.example.user.music_store.instrumentPackage.Keyboard;
import com.example.user.music_store.instrumentPackage.instrumentType;

import org.junit.Test;

/**
 * Created by user on 08/09/2017.
 */

public class KeyboardTest {

    @Test
    public void canPlay() {
        Keyboard piano = new Keyboard(instrumentType.KEYBOARD, "Piano", 130, 300, 88);
    }

}
