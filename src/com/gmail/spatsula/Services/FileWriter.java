package com.gmail.spatsula.Services;

import com.gmail.spatsula.Entity.Food;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileWriter {
    public static boolean write(List<Food> foodList, String fileName){
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(foodList);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
