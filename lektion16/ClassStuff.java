import java.lang.reflect.*;
import java.util.*;

public class ClassStuff {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cardClass = Card.class;

        Constructor[] consts = cardClass.getConstructors();
        System.out.println(Arrays.toString(consts));

        Card c = (Card) consts[0].newInstance();
        System.out.println(c);
    }
}
