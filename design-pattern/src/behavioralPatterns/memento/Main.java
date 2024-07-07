package behavioralPatterns.memento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play(1, 100, List.of("Sword", "Boots"));
        System.out.println(game);

        game.play(2, 200, List.of("Shield"));
        System.out.println(game);

        game.undoLastPlay();
        System.out.println(game);
    }
}
