package Adapter.Ejemplo1.MediaPlayer;

import Adapter.Ejemplo1.Adapter.MusicAdapter;

public class AudioPlayer implements MediaPlayer {
    MusicAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("Mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("WAV") || audioType.equalsIgnoreCase("Mp4")) {
            mediaAdapter = new MusicAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
