package Dao;

import Model.Player;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SaxReader extends DefaultHandler {
    ArrayList<Player> players;

    @Override
    public void startDocument() throws SAXException{
        this.players = new ArrayList<>();
    }
    @Override
    public void endDocument() throws SAXException{
        printDocument();
    }
    @Override
    public void startElement(){

    }

    private void printDocument() {
    }
}
