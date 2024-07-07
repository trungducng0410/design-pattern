package behavioralPatterns.memento;

import java.util.Stack;

public class GameSaveManager {
    private final Stack<GameSave> saves = new Stack<GameSave>();

    public void addSave(GameSave gameSave) {
        saves.push(gameSave);
    }

    public GameSave getLastSave() {
        return saves.pop();
    }
}
