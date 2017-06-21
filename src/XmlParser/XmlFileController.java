package XmlParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XmlFileController {

	static DataModel dm=new DataModel();
	static List<DataModel> lt=new ArrayList<DataModel>();
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
								copyData(fv.getTagName(),fv.getElementsByTagName("field").item(0).getTextContent() );
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

	private static void copyData(String tagName, String textContent) {
		// TODO Auto-generated method stub
		switch(textContent)
		{
		case "Work Record ID" : 
			dm.setWork_Record_ID(tagName);
		case "Work Record Notes" :
	dm.setWork_Record_Notes(tagName);

		case "Reproduction Record ID":
			dm.setReproduction_Record_ID(tagName);break;
		case "Thumbnail Title":
			dm.setThumbnail_Title(tagName);break;
		case "Thumbnail Creator":
			dm.setThumbnail_Creator(tagName);break;
		case "Thumbnail Date":
			dm.setThumbnail_Date(tagName);break;
		case "Thumbnail Work Type":
			dm.setThumbnail_Work_Type(tagName);break;
		case "Work Class":
			dm.setWork_RClass(tagName);break;
		case "Work Type":
			dm.setWork_Type(tagName);break;
		case "Description":
			dm.setDescription(tagName);break;
		case "Title":
			dm.setTitle(tagName);break;
		case "Title Type":
			dm.setTitle_Type(tagName);break;
		case "Material":
		//	private ArrayList<String> Material =new ArrayList<String>();break;
		case "Material Type":
		//	private ArrayList<String> Material_Type =new ArrayList<String>();break;
		case "Creator":
			dm.setCreator(tagName);break;
		case "Creator Dates":
			dm.setCreator_Dates(tagName);break;
		case "Creator Nationality":
			dm.setCreator_Nationality(tagName);break;
		case "Creator Type":
			dm.setCreator_Type(tagName);break;
		case "Creator Role":
			dm.setCreator_Role(tagName);break;
		case "Date":
		//	private ArrayList<String> Date =new ArrayList<String>();break;
		case "Date Type":
		//	private ArrayList<String> Date_Type =new ArrayList<String>();break;
		case " Location":
			dm.setLocations(tagName);break;
		case " Location Type":
			dm.setLocation_Type(tagName);break;
		case "Location":
			dm.setLocation(tagName);break;
		case "Style Period":
		//	private ArrayList<String> Style_Period =new ArrayList<String>();break;
		case "Culture":
			dm.setCulture(tagName);break;
		case "Subject":
		//	private ArrayList<String> Subject =new ArrayList<String>();break;
		case "Reproduction View":
			dm.setReproduction_View(tagName);break;
		case "Reproduction View Type":
			dm.setReproduction_View_Type(tagName);break;
		case "Reproduction Creator Type":
			dm.setReproduction_Creator_Type(tagName);break;
		case "Reproduction Creator":
		//	dm.setReproduction_Creator(tagName);break;
		case "Reproduction Date":
			dm.setReproduction_Date(tagName);break;
		case "Reproduction Date Type":
			dm.setReproduction_Date_Type(tagName);break;
		case "Reproduction Information Source":
			dm.setReproduction_Information_Source(tagName);break;
		case "Reproduction Rights Statement":
			dm.setReproduction_Rights_Statement(tagName); break;

		}
		lt.add(dm);
		
	}

}
