package Dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ScreenReader {
    private static BufferedReader BR = null;
    private ScreenReader(){

    }
    public static BufferedReader getInstance(){
        if(BR == null){
            try {
                BR = new BufferedReader(new FileReader("files/pantallas.txt"));
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return BR;
    }
}
