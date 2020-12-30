/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

import jaco.mp3.player.MP3Player;
import java.io.File;

public class Nhac {

    public static final String SONG = "src\\Music\\danChauA.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));
    public static final String SONG1 = "src\\Music\\false1.mp3";
    MP3Player nen1 = new MP3Player(new File(SONG1));
    public static final String SONG2 = "src\\Music\\win.mp3";
    MP3Player nen2 = new MP3Player(new File(SONG2));

    public void play() {
        mp3player.play();
    }

    public void stop() {
        mp3player.stop();
    }

    public void playFalse() {
        nen1.play();
    }

    public void stop1() {
        nen1.stop();
    }

    public void playWin() {
        nen2.play();
    }

    public void stop2() {
        nen2.stop();
    }
}
