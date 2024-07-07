package behavioralPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int level = 0;
    private int score = 0;
    private List<String> inventory = new ArrayList<>();
    private GameSaveManager gameSaveManager = new GameSaveManager();

    public void play(int levelIncrement, int scoreIncrement, List<String> newItems) {
        gameSaveManager.addSave(createSave());
        level += levelIncrement;
        score += scoreIncrement;
        inventory.addAll(newItems);
    }

    public GameSave createSave() {
        return new GameSave(level, score, new ArrayList<>(inventory));
    }

    public void loadSave(GameSave gameSave) {
        this.level = gameSave.getLevel();
        this.score = gameSave.getScore();
        this.inventory = new ArrayList<>(gameSave.getInventory());
    }

    public void undoLastPlay() {
        loadSave(gameSaveManager.getLastSave());
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", score=" + score +
                ", inventory=" + inventory +
                ", gameSaveManager=" + gameSaveManager +
                '}';
    }
}
