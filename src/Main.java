import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Petya", "Sorokin", 10));
        person.add(new Person("Olya", "Kosolapova", 15));
        person.add(new Person("Dima", "Ivanov", 13));
        person.add(new Person("Николай", "Римский-Корсаков", 50));
        person.add(new Person("Николай", "Миклухо-Маклай", 60));


        person.removeIf((Person remove) -> remove.getAge() < 18);

        person.forEach(System.out::println);

    }
}
