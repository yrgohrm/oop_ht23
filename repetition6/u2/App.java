package u2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        var computers = new ArrayList<>(List.of(new Computer("picard", 3.6, 164554, 2323232323L),
                new Computer("bossebredsladd", 3.1, 2164554, 13232323L),
                new Computer("kirk", 3.1, 164554, 26000000000L),
                new Computer("janeway", 3.1, 2164554, 2323232323L)));

        Collections.sort(computers);

        computers.forEach(System.out::println);

        System.out.println();

        var comp = Comparator.comparingLong(Computer::diskSize);

        Collections.sort(computers, comp);

        computers.forEach(System.out::println);

    }
}
