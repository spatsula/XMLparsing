package com.gmail.spatsula.Services;

import com.gmail.spatsula.Entity.Food;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.List;

public class ParserXML {
    public List<Food> parseXLM(String filePath){
        try{
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
