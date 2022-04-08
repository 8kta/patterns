package Adapter.Ejemplo1.Adapter;

import Adapter.Ejemplo1.AdvancedMediaPlayer.AdvancedMusicPlayer;
import Adapter.Ejemplo1.AdvancedMediaPlayer.VlcPlayer;
import Adapter.Ejemplo1.AdvancedMediaPlayer.iTunesPlayer;
import Adapter.Ejemplo1.MediaPlayer.MediaPlayer;

//MediaPayer is the target
public class MediaAdapter implements MediaPlayer {

    AdvancedMusicPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("WAV")) {
            //SpecificRequest (Object)
            advancedMusicPlayer = new iTunesPlayer();

        } else if (audioType.equalsIgnoreCase("Mp4")) {
            advancedMusicPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.playMusic(fileName);
    }
}
