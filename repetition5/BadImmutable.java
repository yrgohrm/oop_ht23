import java.util.*;

public class BadImmutable {
    record BadStuff(List<String> theList) {
        BadStuff {
            theList = List.copyOf(theList);
        }
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();

        data.add("hej");

        BadStuff bs = new BadStuff(data);

        data.add("ojdå");

        bs.theList().add("ojdå");

        System.out.println(bs);
    }
}
