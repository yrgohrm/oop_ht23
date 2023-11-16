import java.util.*;
import java.util.concurrent.*;

public class RandomThing<T> {
    private Object[] things;

    public RandomThing(T thing1, T thing2, T thing3) {
        this.things = new Object[3];
        this.things[0] = thing1;
        this.things[1] = thing2;
        this.things[2] = thing3;
    }

    @SuppressWarnings("unchecked")
    public T getRandomThing() {
        int r = ThreadLocalRandom.current().nextInt(things.length);
        return (T) things[r];
    }

    public static void main(String[] args) {
        RandomThing<String> randomStuff = new RandomThing<>("apa", "bepa", "cepa");
        String thing = randomStuff.getRandomThing();
        System.out.println(thing);
    }

    public static boolean sameSize(List<?> l1, List<?> l2) {
        return l1.size() == l2.size();
    }

    // the same as above, but more to type
    public static <T1, T2> boolean sameSize2(List<T1> l1, List<T2> l2) {
        return l1.size() == l2.size();
    }

    // both lists must have the same type
    public static <T> boolean sameSize3(List<T> l1, List<T> l2) {
        return l1.size() == l2.size();
    }

}
