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
    //GETTERS
    public char getStateScreen() {
        return stateScreen;
    }

    public int getScreen() {
        return screen;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    //SETTERS
    public void setScore(int score) {
        this.score = score;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public void setStateScreen(char stateScreen) {
        this.stateScreen = Character.toUpperCase(stateScreen);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", screen=" + screen +
                ", stateScreen=" + stateScreen +
                '}';
    }
}
