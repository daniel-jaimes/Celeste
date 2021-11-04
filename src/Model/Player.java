package Model;

public class Player {
    private String name;
    private int score;
    private int screen;
    //C - Complete && P - PENDING
    private char stateScreen;
    public Player(String name, int score, int screen, char stateScreen){
        this.name = name;
        this.score = score;
        this.screen = screen;
        this.stateScreen = stateScreen;
    }

}
