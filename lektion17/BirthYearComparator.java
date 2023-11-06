import java.util.*;

public class BirthYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int year1 = o1.getBirthYear();
        int year2 = o2.getBirthYear();

        // return Integer.compare(year1, year2);
        return year1 - year2;
    }
    
}
