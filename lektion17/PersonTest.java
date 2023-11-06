import java.util.*;

public class PersonTest {
    public static void main(String[] args) {
        Comparator<Person> byComp = Comparator.comparing(Person::getBirthYear);
        
        Person bosse = new Person("Bosse", "Bredsladd", 1962);
        Person nisse = new Person("Nisse", "Hult", 1968);
        Person lena = new Person("Lena", "Lamm", 1979);
        Person anna = new Person("Anna", "Anka", 1979);

        System.out.println(nisse.compareTo(bosse));

        List<Person> listOfPeople = new ArrayList<>(List.of(bosse, lena, nisse, anna));

        Collections.sort(listOfPeople);

        System.out.println(listOfPeople);
        
        Collections.sort(listOfPeople, new BirthYearComparator());
        
        System.out.println(listOfPeople);


        Collections.sort(listOfPeople, byComp);
        
        System.out.println(listOfPeople);

    }
}
