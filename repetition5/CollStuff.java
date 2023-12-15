import java.util.*;

public class CollStuff {
    public static void main(String[] args) {
        Map<Integer, String> zipToCity = new HashMap<>();

        zipToCity.put(41872, "Göteborg");
        zipToCity.put(41873, "Göteborg");
        zipToCity.put(41874, "Göteborg");
        zipToCity.put(41745, "Göteborg");
        zipToCity.put(43447, "Kungsbacka");

        String city = zipToCity.get(43447);
        System.out.println(city);

        city = zipToCity.getOrDefault(53447, "okänd");
        System.out.println(city);

        for (var entry : zipToCity.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
