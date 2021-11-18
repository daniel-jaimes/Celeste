package Manager;


import Dao.InputReader;
import Dao.ScreenReader;
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
        ArrayList<char[][]> levels;
        levels = readScreens();
        //TODO generating salida.xml with the information merge it of their levels and players for each they
        players = readPlayers();
        printPlayers(players);
        printLevels(levels);
    }

    private void printLevels(ArrayList<char[][]> levels) {
        levels.forEach(screen -> {
            for (char[] row : screen) {
                for (char element : row){
                    System.out.println(element + " ");
                }
            }
        });
    }

    private void printPlayers(ArrayList<Player> players) {
        players.forEach(p -> System.out.println(p.toString()));
    }

    private ArrayList<Player> readPlayers() {
        return InputReader.getInstance().getPlayers();
    }

    private ArrayList<char[][]> readScreens() {
        return ScreenReader.getInstance();
    }
}
