public class Highscore {
    private String name;
    private int score;
    private String date;

    // konstruktor för Highscore, skapa aldrig utan att sätta allt!
    public Highscore(String name, int score, String date) {
        this.name = name;
        this.score = score;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getDate() {
        return date;
    }

    
}
