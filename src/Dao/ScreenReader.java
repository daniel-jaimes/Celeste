package Dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ScreenReader {
    public static ArrayList<String[][]> screens;
    public static ArrayList<String[][]> getInstance(){
        if(screens == null){
            BufferedReader BR;
            try {
                BR = new BufferedReader(new FileReader("files/pantallas.txt"));
                String str;
                while((str = BR.readLine()) == null){
                    
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        return screens;
    }
}
