public class PlayerMain {
    public static void main(String[] args) {
        Player thePlayer = new Player(0, 0);

        // vi får poäng

        thePlayer = thePlayer.increaseScore(1);

        System.out.println(thePlayer);
    }
}
