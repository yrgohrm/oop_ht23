package u2;

import java.util.*;

public record Computer(String name, double cpuFrequency, long ramSize, long diskSize) 
    implements Comparable<Computer> {

    private static final Comparator<Computer> comp = Comparator.comparingDouble(Computer::cpuFrequency)
                                        .thenComparingLong(Computer::ramSize)
                                        .thenComparingLong(Computer::diskSize)
                                        .reversed();

    @Override
    public int compareTo(Computer o) {
        return comp.compare(this, o);
    }

}
