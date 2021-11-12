package Manager;


import Dao.InputReader;
import Model.Player;

import java.util.ArrayList;

public class Controller {
    private static Controller controller;
    private Controller(){
    }
    //SINGLETON
    public static Controller getInstance(){
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }
    
    public void init() {
        ArrayList<Player> players;
        //String[][][] levels;
        //levels = readLevels();


        //TODO process txt file and save levels in memory
        //TODO process entrada.xml and save players in memory with SAX
        //TODO generating salida.xml with the information merge it of their levels and players for each they

        players = readPlayers();
        printPlayers(players);
    }

    private void printPlayers(ArrayList<Player> players) {
        players.forEach(p -> System.out.println(p.toString()));
    }

    private ArrayList<Player> readPlayers() {
        return InputReader.getInstance().getPlayers();
    }

    private String[][][] readScreens() {
        String[][][] levels;

        return new String[0][][];
    }
}
