public record Player(int score, int level) {

    // we can't change records, but we can create new ones
    public Player increaseScore(int i) {
        return new Player(score() + i, level());
    }
}
