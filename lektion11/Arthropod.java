import java.util.*;

public class Arthropod extends Animal {
    private List<String> stages;

    public Arthropod(String name, List<String> stages) {
        super(name);
        this.stages = new ArrayList<>(stages);
    }

    public List<String> getStages() {
        // return new ArrayList<>(stages);
        return Collections.unmodifiableList(stages);
    }
}
