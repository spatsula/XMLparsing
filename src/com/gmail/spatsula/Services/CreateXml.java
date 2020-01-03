package com.gmail.spatsula.Services;

import com.gmail.spatsula.Entity.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class CreateXml {
    public static boolean createDOM(List<User> toXMLlist, String filePath){
        try{
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            //create root element -> group
            Element group = document.createElement("group");
            document.appendChild(group);

            for (User user:toXMLlist){
                //create sub elements -> user
                Element userElement = document.createElement("user");
                group.appendChild(userElement);

                // add element
                Element name = document.createElement("name");
                name.appendChild(document.createTextNode(user.getName()));
                userElement.appendChild(name);

                Element surename = document.createElement("surename");
                surename.appendChild(document.createTextNode(user.getSurename()));
                userElement.appendChild(surename);

                Element phone = document.createElement("phone");
                phone.appendChild(document.createTextNode(user.getPhone()));
                userElement.appendChild(phone);
            }

            // create XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(filePath));
            transformer.transform(domSource, streamResult);
            
            System.out.println("XML create file DONE!");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
