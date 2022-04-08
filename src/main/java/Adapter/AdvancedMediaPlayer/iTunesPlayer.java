package Adapter.AdvancedMediaPlayer;

public class iTunesPlayer implements AdvancedMusicPlayer {

    @Override
    public void playFullScreen(String fileName) {
        System.out.println("Playing video in full screen. Name: " + fileName);
    }

    @Override
    public void playWithAlbumCover(String fileName) {
        System.out.println("Playing music with album cover. Name: " + fileName);
    }
}