import java.util.concurrent.*;

public class GameDie {
    private int sides;

    public GameDie(int sides) {
        if (sides <= 1) {
            // skapa ett felmeddelande
        }

        this.sides = sides;
    }

    public GameDie() {
        this(6);
    }

    public int roll() {
        return ThreadLocalRandom.current().nextInt(1, sides + 1);
    }
}
