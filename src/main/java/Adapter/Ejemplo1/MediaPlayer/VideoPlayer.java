package Adapter.Ejemplo1.MediaPlayer;

import Adapter.Ejemplo1.Adapter.MusicAdapter;

public class VideoPlayer implements MediaPlayer {
    MusicAdapter mediaAdapter;

    @Override
    public void play(String videoType, String fileName) {

        //inbuilt support to play mp3 music files
        if (videoType.equalsIgnoreCase("AVI")) {
            System.out.println("Playing AVI file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if (videoType.equalsIgnoreCase("MKV") || videoType.equalsIgnoreCase("mp4Video" )) {
            mediaAdapter = new MusicAdapter(videoType);
            mediaAdapter.play(videoType, fileName);
        } else {
            System.out.println("Invalid media. " + videoType + " format not supported");
        }
    }
}
