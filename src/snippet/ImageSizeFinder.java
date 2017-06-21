package snippet;
// Takes the list of files as input and compresses them 
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class ImageSizeFinder {
	static int height=0;
	static int width=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =null;
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
			
			file=new File("C:\\Users\\adepu\\Desktop\\Collection 1057 Modernist Cincinnati-compressed\\"+append+".jpg");
			double size = ((file.length()/1024) / 1024);
			System.out.println("FILE: "+append+" Size: "+size);
			if(size >= 2.0)
			{
				try{
				InputStream inputStream = new FileInputStream(new File("C:\\Users\\adepu\\Desktop\\Collection 1057 Modernist Cincinnati-compressed\\"+append+".jpg"));
				OutputStream outputStream = new FileOutputStream(new File("C:\\Users\\adepu\\Desktop\\Collection 1057 Modernist Cincinnati-compressed\\"+append+".jpg"));
				float imageQuality = 0.3f;
				BufferedImage bufferedImage = ImageIO.read(inputStream);
				Iterator<ImageWriter> imageWriters = ImageIO.getImageWritersByFormatName("jpg");
				if (!imageWriters.hasNext())
					throw new IllegalStateException("Writers Not Found!!");
				ImageWriter imageWriter = (ImageWriter) imageWriters.next();
				ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(outputStream);
				imageWriter.setOutput(imageOutputStream);
				ImageWriteParam imageWriteParam = imageWriter.getDefaultWriteParam();
				imageWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
				imageWriteParam.setCompressionQuality(imageQuality);
				imageWriter.write(null, new IIOImage(bufferedImage, null, null), imageWriteParam);
				inputStream.close();
				outputStream.close();
				imageOutputStream.close();
				imageWriter.dispose();
				file=new File("C:\\Users\\adepu\\Desktop\\"+append+".jpg");
				size = ((file.length()/1024) / 1024);
				System.out.print("---> Size: "+(int)size+"  >>DONE\n ");
				}
				catch(Exception e)
				{
					continue;
				}
			}
		}
	}

}

