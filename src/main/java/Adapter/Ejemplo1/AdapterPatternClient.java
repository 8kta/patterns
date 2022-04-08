package Adapter.Ejemplo1;

import Adapter.Ejemplo1.MediaPlayer.AudioPlayer;

public class AdapterPatternClient {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("Mp3", "beyond the horizon.Mp3");
        audioPlayer.play("Mp4", "alone.Mp4");
        audioPlayer.play("WAV", "far far away.WAV");
        audioPlayer.play("avi", "mind me.avi");
    }
}