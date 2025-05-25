
package testing;

import com.doan.swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class test {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\NGUYEN ANH KIET\\Pictures\\Nitro\\icon.png"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
