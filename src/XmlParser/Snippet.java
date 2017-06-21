package XmlParser;
import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Snippet {
	   public static void main(String[] args){

	      try {	
	         File inputFile = new File("C:/Users/adepu/Desktop/Collection 1057 Modernist Cincinnati/data.xml");
	         SAXParserFactory factory = SAXParserFactory.newInstance();
	         SAXParser saxParser = factory.newSAXParser();
	         UserHandler userhandler = new UserHandler();
	         saxParser.parse(inputFile, userhandler);     
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }   
	}

	class UserHandler extends DefaultHandler {

	   boolean bFirstName = false;
	   boolean bLastName = false;

	   @Override
	   public void startElement(String uri, 
	      String localName, String qName, Attributes attributes)
	         throws SAXException {
	      if (qName.equalsIgnoreCase("record")) {
	    	  String rollNo = attributes.getValue("type");
	          System.out.println("TYPE: : " + rollNo);
	      } else if (qName.equalsIgnoreCase("field")) {

	    	  String tt = attributes.getValue("type");
	          System.out.println("field tt: : " + tt);
	         bFirstName = true;
	      } else if (qName.equalsIgnoreCase("field Groups")) {

	    	  String ttt = attributes.getValue("type");
	          System.out.println("fieldgroup  ttt: : " + ttt);
	    	  bLastName = true;
	      }
	   }

	   @Override
	   public void endElement(String uri, 
	      String localName, String qName) throws SAXException {
	      if (qName.equalsIgnoreCase("record")) {
	         System.out.println("End Element :" + qName);
	      }
	   }

	   @Override
	   public void characters(char ch[], 
	      int start, int length) throws SAXException {
	      if (bFirstName) {
	         System.out.println("First Name: " 
	         + new String(ch, start, length));
	         bFirstName = false;
	      } else if (bLastName) {
	         System.out.println("Last Name: " 
	         + new String(ch, start, length));
	         bLastName = false;
	      } 
	   }
	}
