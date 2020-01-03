package test;

import com.gmail.spatsula.Entity.Food;
import com.gmail.spatsula.Services.FileWriter;
import com.gmail.spatsula.Services.ParserXML;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {
    @org.junit.jupiter.api.Test
    void writeToFile() {
        List<Food> foodList = ParserXML.parseXLM("xmlToParse.xml");
        assertTrue(FileWriter.write(foodList,"parsedFromFile.txt"));
    }
}