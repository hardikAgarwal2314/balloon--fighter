package balloon;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;


public class Resources {


    private static Image balloonImage;
    private static Image STARTImage;

    private static Image bombImage;

    private static Image gameOverImage;
    private static AudioClip burstAudio;

    public static Image getBalloonImage() {
        return balloonImage;
    }

    public static Image getSTARTImage() {
        return STARTImage;
    }

    public static Image getBombImage() {
        return bombImage;
    }

    public static Image getGameOverImage() {
        return gameOverImage;
    }

    public static AudioClip getBurstAudio() {
        return burstAudio;
    }



    public static void load() {
        try {
            Resources.balloonImage = ImageIO.read(Resources.class.getResource("images1/balloon.png"));
            Resources.STARTImage = ImageIO.read(Resources.class.getResource("images1/START.png"));
            Resources.gameOverImage = ImageIO.read(Resources.class.getResource("images1/boom.png"));
            Resources.bombImage = ImageIO.read(Resources.class.getResource("images1/bomb.png"));
            Resources.burstAudio = Applet.newAudioClip(Resources.class.getResource("images1/hit.wav"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
