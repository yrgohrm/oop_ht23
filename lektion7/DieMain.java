public class DieMain {
    public static void main(String[] args) {
        GameDie theDie = new GameDie();

        for (int i = 0; i < 5; i++) {
            System.out.println(theDie.roll());
        }
    }
}
