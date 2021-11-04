package Dao;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {
    private static FileReader reader;
    private Reader(){

    }
    public static FileReader getInstance(){
        if(reader == null) {
            FileReader FR = null;
            try {
                FR = new FileReader("files/pantallas.txt");
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

            reader = FR;
        }
        return reader;
    }
}
