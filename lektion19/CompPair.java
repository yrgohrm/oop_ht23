import java.util.*;

public record CompPair<T1 extends Comparable<T1>, T2 extends Comparable<T2>>(T1 first, T2 second)
        implements Comparable<CompPair<T1, T2>> {

    @Override
    public int compareTo(CompPair<T1, T2> o) {
        Comparator<CompPair<T1, T2>> comp =
                Comparator.comparing(CompPair<T1, T2>::first)
                          .thenComparing(CompPair<T1, T2>::second);
        return comp.compare(this, o);
    }

}
