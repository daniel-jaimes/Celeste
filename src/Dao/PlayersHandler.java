package Dao;

import Model.Player;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class PlayersHandler extends DefaultHandler {
    private ArrayList<Player> players;
    private Player player;
    String value;

    public ArrayList<Player> getPlayers() {
        return players;
    }

    @Override
    public void characters(char[] ch, int start, int lenght) throws SAXException{
        this.value = new String(ch, start, lenght);
    }
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException{
        switch (qName){
            case "partida":
                this.players.add(player);
                break;
            case "puntuacion":
                player.setScore(Integer.parseInt(this.value));
                break;
            case "pantalla":
                player.setScreen(Integer.parseInt(this.value.charAt(1) + ""));
                break;
        }
    }
    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException{
        switch (qName){
            case "partida":
                String name = attributes.getValue("jugador");
                player = new Player(name);
                break;
            case "pantalla":
                player.setStateScreen(attributes.getValue("estado").charAt(0));
                break;
        }
    }

    @Override
    public void startDocument() throws SAXException {
        this.players = new ArrayList<>();
    }
}
