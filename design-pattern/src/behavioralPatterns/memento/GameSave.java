package behavioralPatterns.memento;

import java.util.List;

public class GameSave {
    private int level;
    private int score;
    private List<String> inventory;

    public GameSave(int level, int score, List<String> inventory) {
        this.level = level;
        this.score = score;
        this.inventory = inventory;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }
}
