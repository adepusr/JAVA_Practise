package snippet;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


import org.w3c.dom.Node;
import org.w3c.dom.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadXMLFile {

  public static void main(String argv[]) {

    try {
	File fXmlFile = new File("C:/Users/adepu/Downloads/2017-05-19 Batch 360 moore/original/data.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	String description=null;
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	NodeList nList = doc.getElementsByTagName("record");
	System.out.println("----------------------------");
	for (int temp = 0; temp < nList.getLength(); temp++) 
	{
		Node nNode = nList.item(temp);
		System.out.println("\n.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>.>"+"Record "+temp);
		if(nNode.getNodeType()==Node.ELEMENT_NODE)
		{
			Element val=(Element) nNode;
			String type = val.getAttribute("type");
			
			NodeList valList=val.getChildNodes();
			System.out.println(type);

			for(int i=0;i<valList.getLength();i++)
			{
				Node n=valList.item(i);
				if(n.getNodeType()==Node.ELEMENT_NODE)
				{
					Element fv=(Element) n;
					if(fv.getTagName()=="fieldGroup")
					{
						
						if(fv.hasChildNodes()){
						//	Element ab=(Element) fv.getFirstChild() ;
						//Element fv2=(Element) n2;
						//	System.out.println(ab.getTagName());
							System.out.println(fv.getAttribute("type")+" : "+ fv.getTagName() +" --> "+fv.getElementsByTagName("field").item(0).getTextContent());
						}
					}
					else{
						if(fv.getAttribute("type")=="Work Record Notes")
					System.out.println(" "+fv.getAttribute("type")+" : "+fv.getTagName()+" --> "+fv.getTextContent());
					}
				}
			}
		}
    }
    }catch (Exception e) {
	e.printStackTrace();
    }
  }
}
