package Dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ScreenReader {
    private static ArrayList<char[][]> screens;
    public static ArrayList<char[][]> getInstance(){
        if(screens == null){
            BufferedReader BR;
            try {
                BR = new BufferedReader(new FileReader("files/pantallas.txt"));
                String str;
                boolean endreader = false;
                int index = 0, row = 0;
                while((str = BR.readLine()) != null && !endreader){
                    char firstChar = str.charAt(0);
                    char[][] screen = new char[5][10];
                    if(str.length() == 2 && firstChar == '#'){
                        if(row > 0) screens.add(screen);
                        row = 0;
                    }
                    if(str.length() == 1 && firstChar == '#'){
                        endreader = true;
                    }
                    if(str.length() > 2){
                        String[] arrayStr = str.split(" ");
                        str = Arrays.toString(arrayStr);
                        screen[row] = str.toCharArray();

                        row++;
                    }

                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        return screens;
    }
}
