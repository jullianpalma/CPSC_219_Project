import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;


public class OggPlayer {
    private static boolean Open(){
        AudioInputStream in = AudioSystem.getAudioInputStream(new File("test.ogg"));
        return (in.equals(null));
    }
}
