package snippet;
// Converts TIF images to JPEG
import java.awt.Color;
import com.sun.media.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import com.sun.media.*;
import javax.imageio.ImageIO;
public class ImageCompress_format {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedImage bufferedImage;
		int nam = 0;
		String name="",append="";
		//read image file
		for(int i=0;i<1328;i++)
		{
			append="";
			nam++;
			name=Integer.toString(nam);
			if(name.length()!=6)
			{
				for(int j=0;j<6-name.length();j++)
				{
					append+="0";
				}
				append +=name;
			}
			try{
			System.out.println(append);
			bufferedImage = ImageIO.read(new File("C:\\Users\\adepu\\Desktop\\Collection 1057 Modernist Cincinnati\\"+append+".tif"));
			BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
			newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);
			ImageIO.write(newBufferedImage, "jpeg", new File("C:\\Users\\adepu\\Desktop\\Collection 1057 Modernist Cincinnati-compressed\\"+append+".jpg"));
			System.out.println("Done "+i);
			}
			catch(Exception e){
				continue;
			}
		}
	}
}
