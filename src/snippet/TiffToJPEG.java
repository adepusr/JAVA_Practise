package snippet;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class TiffToJPEG {

	public static void main(String[] args) throws IOException {
		String append[] ={"000777"};
		BufferedImage bufferedImage;
		// TODO Auto-generated method stub
		for(int j=0; j<1; j++){
		bufferedImage = ImageIO.read(new File("C:\\Users\\adepu\\Desktop\\Collection 1057 Modernist Cincinnati\\"+append[j]+".tif"));
		BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
		newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);
		ImageIO.write(newBufferedImage, "jpeg", new File("C:\\Users\\adepu\\Desktop\\Collection 1057\\"+append[j]+".jpg"));
		System.out.println("Done "+j);
		}
	}

}
