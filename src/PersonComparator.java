import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxLength;

    public PersonComparator() {
        this.maxLength = maxLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.getSurname().split("(?U)\\W").length;
        int length2 = o2.getSurname().split("(?U)\\W").length;
        if (Math.min(length1, maxLength) != Math.min(length2, maxLength)) {
            return Integer.compare(length1, length2);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}

