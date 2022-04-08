package Adapter.Ejemplo1.MediaPlayer;

import Adapter.Ejemplo1.Adapter.MediaAdapter;
import Adapter.Ejemplo1.Utils.EnumOperations;

public class Player implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void playMusic(String type, String fileName) {
        if (EnumOperations.isInEnum(type, MusicFormats.class)) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.playMusic(type, fileName);
        }
        else {
            System.out.println("This is not a compatible music format");
        }
    }

    @Override
    public void playVideo(String type, String fileName) {
        //inbuilt support to play avi music files
        if (type.equalsIgnoreCase("AVI")) {
            System.out.println("Playing avi video file (already supported). Name: " + fileName);
        }
        else if (EnumOperations.isInEnum(type, VideoFormats.class)) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.playVideo(type, fileName);
        }
        else {
            System.out.println("This is not a compatible video format");
        }
    }
}

