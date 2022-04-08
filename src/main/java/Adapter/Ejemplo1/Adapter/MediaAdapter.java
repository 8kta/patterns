package Adapter.Ejemplo1.Adapter;

import Adapter.Ejemplo1.AdvancedMediaPlayer.AdvancedMusicPlayer;
import Adapter.Ejemplo1.AdvancedMediaPlayer.iTunesPlayer;
import Adapter.Ejemplo1.MediaPlayer.MediaPlayer;

//MediaPayer is the target
public class MediaAdapter implements MediaPlayer {

    AdvancedMusicPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        advancedMusicPlayer = new iTunesPlayer();
    }


    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.playMusic(fileName);
    }
}
