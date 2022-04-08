package Adapter.Ejemplo1.MediaPlayer;

import Adapter.Ejemplo1.Adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {

        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("Mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("WAV") || audioType.equalsIgnoreCase("Mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }

    public static <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

}
