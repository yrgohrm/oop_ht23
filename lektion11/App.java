import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> insectStages = new ArrayList<>();
        insectStages.add("ägg");
        insectStages.add("larv");
        insectStages.add("puppa");
        insectStages.add("imago");

        Arthropod bee = new Arthropod("bi", insectStages);
        Arthropod krill = new Arthropod("krill", List.of("ägg", "nauplius", "vuxen"));

        Chordate human = new Chordate("människa", 0);
        Chordate tunicate = new Chordate("glasgrodd", 4);

        List<Animal> animals = List.of(bee, krill, human, tunicate);

        for (Animal animal : animals) {
            System.out.println(animal.getName());

            if (animal instanceof Chordate chordate) {
                System.out.println(chordate.getTailLengthMeters());
            }
        }

    }
}