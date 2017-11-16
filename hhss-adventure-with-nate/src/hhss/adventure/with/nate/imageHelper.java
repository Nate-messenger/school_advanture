package hhss.adventure.with.nate;


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class imageHelper {
    public static BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return img;
    }
}
