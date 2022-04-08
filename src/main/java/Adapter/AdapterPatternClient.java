package Adapter;

import Adapter.MediaPlayer.Player;

public class AdapterPatternClient {
    public static void main(String[] args) {
        Player player = new Player();

        player.playMusic("MP3", "beyond the horizon.Mp3");
        player.playMusic("MP4", "alone.Mp4");
        player.playMusic("WAV", "far far away.WAV");
        player.playMusic("AVI", "mind me.avi");

        player.playVideo("MP3", "beyond the horizon.Mp3");
        player.playVideo("MP4", "MiPobreAngelito.Mp4");
        player.playVideo("MKV", "Matrix.WAV");
        player.playVideo("AVI", "Chucky.avi");
    }
}