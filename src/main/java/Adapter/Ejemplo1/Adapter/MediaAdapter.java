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
    public void playMusic(String audioType, String fileName) {
        advancedMusicPlayer.playWithAlbumCover(fileName);
    }

    @Override
    public void playVideo(String videoType, String fileName) {
        advancedMusicPlayer.playFullScreen(fileName);
    }
}
