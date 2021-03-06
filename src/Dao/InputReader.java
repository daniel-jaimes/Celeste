package Dao;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class InputReader {
    private static PlayersHandler handler;
    private InputReader(){

    }
    public static PlayersHandler getInstance(){
        if(handler == null){
            try {
                File file = new File("files/entrada.xml");
                SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
                SAXParser saxParser = saxParserFactory.newSAXParser();
                handler = new PlayersHandler();
                saxParser.parse(file, handler);
            } catch (IOException | SAXException | ParserConfigurationException e) {
                System.out.println(e.getMessage());
            }
        }
        return handler;
    }
}
