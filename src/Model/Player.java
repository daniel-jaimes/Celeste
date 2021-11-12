package Model;

public class Player {
    private String name;
    private int score;
    private int screen;
    //C - Complete && P - PENDING
    private char stateScreen;
    public Player(String name){
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public void setStateScreen(char stateScreen) {
        this.stateScreen = Character.toUpperCase(stateScreen);
    }

}
