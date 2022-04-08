package Adapter.Adapter;

import Adapter.AdvancedMediaPlayer.AdvancedMusicPlayer;
import Adapter.AdvancedMediaPlayer.iTunesPlayer;
import Adapter.MediaPlayer.MediaPlayer;

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
