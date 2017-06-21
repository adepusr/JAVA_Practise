package snippet;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XMLtoDBparser{
	static String recid=" ";
	static String title=" ";
	static String subject=" ";
	static String description=" ";
	static String creator=" ";
	static String date=" ";
	static String contributor=" ";
	static String rights=" ";
	static String format="";
	static String language= "English";
	static String type=" ";
	static String datecreated=" ";
	static String referencess=" ";
	static String spatialcoverage=" ";
	static String temporalcoverage=" ";
	static String errorRecs="", reproductionview="";
	static Connection con=null;
	public static void connect()
	{
		String url="jdbc:mysql://localhost/data";
		String user="root";
		String psw="";
		try{
			con=DriverManager.getConnection(url, user, psw);
			System.out.println("-Connected1-");			
		}
		catch(SQLException e)
		{
			System.out.println("-->--"+e);
		}
	}
   public static void main(String[] args){
	   
      try {	
    	  connect();
         File inputFile = new File("C:/Users/adepu/Desktop/Collection 1057 Modernist Cincinnati/data.xml");
         DocumentBuilderFactory dbFactory 
            = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :" 
            + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("record");
         System.out.println("----------------------------");
         
        		
         for (int temp = 0;temp < 1328; temp++) {
        	
     		recid=" ";
     		title=" ";
     		subject=" ";
     		description=" ";
     		creator=" ";
     		date=" ";
     		contributor=" ";
     		rights=" ";
     		format="";
     		language= "English";
     		type=" ";
     		datecreated=" ";
     		referencess=" ";
     		spatialcoverage=" ";
     		temporalcoverage=" ";
     		reproductionview= " ";
        	Node nNode = nList.item(temp);
          //  System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
            //System.out.println(nNode.isEqualNode());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               
               for(int tem=0;tem < eElement.getElementsByTagName("field").getLength();tem++ ) {
               Element a = (Element)(eElement.getElementsByTagName("field").item(tem));
            	  // System.out.println("Field : "+ eElement.getElementsByTagName("field").item(tem).getTextContent()+" --> " + a.getAttribute("type"));
            	   datacatcher(eElement.getElementsByTagName("field").item(tem).getTextContent(),a.getAttribute("type"));
            	   
               }
            }
         char[] ds= description.toCharArray();
         char[] ti= title.toCharArray();
         char[] rv= reproductionview.toCharArray();
         
 		String d="";
 		for(int x=0;x<ds.length;x++){
 			d +=ds[x];
 			if(ds[x] == '\'')
 			{
 				d += ds[x];
 			}
 		}
 		description =d;
 		d="";
 		for(int x=0;x<ti.length;x++){
 			d +=ti[x];
 			if(ti[x] == '\'')
 			{
 				d += ti[x];
 			}
 		}
 		title=d; 	
 		d="";
 		for(int x=0;x<rv.length;x++){
 			d +=rv[x];
 			if(rv[x] == '\'')
 			{
 				d += rv[x];
 			}
 		}
 		reproductionview=d; 	
 		String query="INSERT INTO complete (recid, title, subject, description, creator, date , reproductionview, contributor, rights, format, language, type, datecreated, referencess, spatialcoverage, temporalcoverage)"
         		+ "VALUES('"+recid+"','"+title+"','"+ subject+"','"+description+"','"+creator+"','"+date +"','"+reproductionview +"','"+ contributor+"','"+ rights+"','"+format+"','"+ language+"','"+ type+"','"+ datecreated+"','"+ referencess+"','"+ spatialcoverage+"','"+ temporalcoverage+"')"; 
 		System.out.println(query);
 		try {
 			Statement stt=con.createStatement();
 			stt.executeUpdate(query);	 				
 		} 
 		catch (SQLException e) {
 				e.printStackTrace();
 				errorRecs += recid +"<->";
 			}
         }
       //  System.out.println("TITLE: "+title+"\n SUBJECT: "+ subject+"\n DES:"+description+"\n CREAT: "+creator+"\n DATE: "+date +"\n CONTRIB: "+ contributor+"\n RIGH: "+ rights+"\n FORMA: "+format+"\n LANG: "+ language+"\n TYPE: "+ type+"\n DATECRE: "+ datecreated+"\n REF: "+ references+"\n SPATIALCOVER: "+ spatialcoverage+"\n TEMPOCOVER: "+ temporalcoverage+"");
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println(errorRecs);
   }

private static void datacatcher(String textContent, String attribute) {
	switch(attribute)
	{
		case "Work Record ID":
			recid= textContent;
			break;
		case "Title":
			title = textContent;
			break;
		case "Subject":
			subject += textContent +"; ";
			break;
		case "Description": 
			description = textContent;
			break;
		case "Creator":
			creator = textContent;	
			break;
		case "Date": 
			date = textContent;
			break;
		case "Reproduction Creator":
			contributor = textContent;
			break;
		case "Reproduction Rights Statement":
			rights = textContent;
			break;
		case "Material":
			format += textContent+"; ";
			break;
		case "Work Type":
			type += textContent+"; ";
			break;
		case "Work Class":
			type += textContent+"; ";
			break;
		case "Reproduction Date":
			datecreated = textContent;
			break;
		case "Reproduction Information Source":
			referencess = textContent;
			break;
		case "Location":
			spatialcoverage = textContent;
			break;
		case "Style Period":
			temporalcoverage += textContent +"; ";
			break;
		case "Reproduction View":
			reproductionview += textContent;
				break;
		default:
			break;
	}
	
	}
}