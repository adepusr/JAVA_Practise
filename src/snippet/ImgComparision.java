package snippet;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImgComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File OracleJava = new File("C:/Users/adepu/Desktop/1.jpg");
	      File javaOracle = new File("C:/Users/adepu/Desktop/2.jpg");
	      ImgComparision imgComp = new ImgComparision();
	      System.out.println(imgComp.compareTwoImages( OracleJava , javaOracle));
	}

	public boolean compareTwoImages(File fileOne, File  fileTwo) {
        Boolean isTrue = true;
        try{
            Image imgOne = ImageIO.read(fileOne);
            Image imgTwo = ImageIO.read(fileTwo);
            BufferedImage bufImgOne = ImageIO.read(fileOne);
            BufferedImage bufImgTwo = ImageIO.read(fileTwo);
            int imgOneHt = bufImgOne.getHeight();
            int imgTwoHt = bufImgTwo.getHeight();
            int imgOneWt = bufImgOne.getWidth();
            int imgTwoWt = bufImgTwo.getWidth();
            System.out.println("1height: "+imgOneHt+"  1width:"+imgOneWt+"2height: "+imgTwoHt+"  2width:"+imgTwoWt);
            if(imgOneHt!=imgTwoHt ||(imgOneWt!=imgTwoWt)){
                System.out.println(" size are not equal ");
                isTrue = false;
            }
            
            int count=0;
            for(int x =0; x < imgOneWt; x++ ){ //replace the loop, if needed
                for(int y =0; y < imgOneHt ; y++){
                    if(bufImgOne.getRGB(x, y) != bufImgTwo.getRGB(x, y) ){
                        System.out.println(" rgb are not equal ");
                        isTrue = false;
                        break;
                    }
                    count++;
                }
            }
            System.out.println("-----> "+count);
        }catch (IOException e) {
                        e.printStackTrace();
        }
        return isTrue;
    }
	
}
