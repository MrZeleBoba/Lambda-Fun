import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Petya", "Sorokin", 10));
        person.add(new Person("Olya", "Kosolapova", 15));
        person.add(new Person("Dima", "Ivanov", 13));
        person.add(new Person("Николай", "Римский-Корсаков", 50));
        person.add(new Person("Николай", "Миклухо-Маклай", 60));

        Comparator<Person> comparator = (o1, o2) -> {
            int length1 = o1.getSurname().split("(?U)\\W").length;
            int length2 = o2.getSurname().split("(?U)\\W").length;
            if (Math.min(length1, 2) != Math.min(length2, 2)) {
                return Integer.compare(length1, length2);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        };


        Collections.sort(person, comparator); //(o1, o2) -> {


        System.out.println(person);
    }
}
