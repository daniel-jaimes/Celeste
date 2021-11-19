package Manager;


import Dao.InputReader;
import Dao.ScreenReader;
import Model.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    //SINGLETON
    private static final Controller controller;
    static {
        controller = new Controller();
    }
    private Controller(){
    }
    public static Controller getInstance(){
        return controller;
    }
    
    public void init() {
        ArrayList<Player> players;
        ArrayList<Character[][]> levels;
        levels = readScreens();
        //TODO generating salida.xml with the information merge it of their levels and players for each they
        players = readPlayers();
        writeOutput(levels, players);
    }

    private void writeOutput(ArrayList<Character[][]> levels, ArrayList<Player> players) {

    }

    private ArrayList<Player> readPlayers() {
        return InputReader.getInstance().getPlayers();
    }

    private ArrayList<Character[][]> readScreens() {
        ArrayList<Character[][]> screens;
        screens = new ArrayList<>();
        String line;
        boolean endReader = false;
        ArrayList<Character[]> display = new ArrayList<>();
        try {
            BufferedReader BR = ScreenReader.getInstance();
            while((line = BR.readLine()) != null && !endReader){
                comands(line, endReader, display, screens);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return screens;
    }
    private void comands(String str, boolean endReader, ArrayList<Character[]> screen,
                         ArrayList<Character[][]> screens) {
        char firstChar = str.charAt(0);
        if(firstChar == '#' && screen.size() != 0) {
            Character[][] display = new Character[screen.size()][screen.get(0).length];
            screen.toArray(display);
            screens.add(display);
        }
        if(str.length() == 1 && firstChar == '#'){
            endReader = true;
        }
        if(str.length() == 2 && firstChar == '#'){
            screen.clear();
        }
        if(str.length() > 2){
            str = str.replaceAll("\\s+", "");
            //recorro el string pasandolo a un array de Character y luego lo añado.
            screen.add(str.chars().mapToObj(c -> (char)c).toArray(Character[]::new));
        }
    }
}
