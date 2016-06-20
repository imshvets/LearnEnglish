package readerXML;


import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg on 13.06.2016.
 */
public class ReadXMLFile {

        /*
        try {
            File fXmlFile = new File("src\\dictionary.xdxf");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("ar");

            System.out.println(nList.getLength());

            for (int temp = 0; temp < 30; temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    NodeList childList = eElement.getChildNodes();

                    String origin = "";
                    String translate = "";

                    for (int i = 0; i < childList.getLength(); i++) {
                        if (childList.item(i).getNodeType() == Node.TEXT_NODE){
                            origin = childList.item(i).getTextContent();
                        }
                        else {
                            translate = childList.item(i).getTextContent();
                        }
                    }

                    System.out.println("English word: " + origin);
                    System.out.println("Переклад : " + "\r\n" + translate);
                    System.out.println("\r\n");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

}

