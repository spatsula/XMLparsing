package com.gmail.spatsula.Services;

import com.gmail.spatsula.Entity.Food;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParserXML {
    public static List<Food> parseXLM(String filePath){
        
        List<Food> foodList = new ArrayList<>();
        
        try{
            File inputFile = new File(filePath);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("food");
            
            for (int counter = 0; counter < nodeList.getLength(); counter++) {
                Node nNode = nodeList.item(counter);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element foodElement = (Element) nNode;
                    Food food = new Food();
                    food.setName(foodElement.getElementsByTagName("name").item(0).getTextContent());
                    food.setPrice(foodElement.getElementsByTagName("price").item(0).getTextContent());
                    food.setDescription(foodElement.getElementsByTagName("description").item(0).getTextContent());
                    food.setCalories(foodElement.getElementsByTagName("calories").item(0).getTextContent());
                    foodList.add(food);
                }
            }
            
            if (foodList.isEmpty())
                return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return foodList;
    }
}
