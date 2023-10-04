package u2;

import java.util.*;

public class IceCream {
    private String holder;
    private List<IceCreamScoop> scoops;

    public IceCream(String holder) {
        this.holder = holder;
        this.scoops = new ArrayList<>();
    }

    public boolean addScoop(IceCreamScoop scoop) {
        if (scoops.size() >= 5) {
            return false;
        }

        scoops.add(scoop);
        return true;
    }

    public int size() {
        return scoops.size();
    }

    @Override
    public String toString() {
        String res = "Ice cream in a " + holder + " with ";
        for (IceCreamScoop scoop : scoops) {
            res += scoop + ", ";
        }
        return res;
    }
}
