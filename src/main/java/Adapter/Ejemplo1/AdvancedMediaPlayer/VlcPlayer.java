package Adapter.Ejemplo1.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMusicPlayer {

    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video in video format. Name: "+ fileName);
    }

    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing music in music format. Name: "+ fileName);
    }
}
