package test;

import com.gmail.spatsula.Entity.Food;
import com.gmail.spatsula.Services.ParserXML;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserXMLTest {
    @org.junit.jupiter.api.Test
    void parseDOM() {
        List<Food> foodList = ParserXML.parseXLM("xmlToParse.xml");
        assertEquals(foodList.size(),5);
    }
    
}