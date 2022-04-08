package Adapter.Ejemplo1;

import Adapter.Ejemplo1.MediaPlayer.Player;

public class AdapterPatternClient {
    public static void main(String[] args) {
        Player player = new Player();

        player.playMusic("MP3", "beyond the horizon.Mp3");
        player.playMusic("MP4", "alone.Mp4");
        player.playMusic("WAV", "far far away.WAV");
        player.playMusic("AVI", "mind me.avi");
    }
}