package CollectionsExamplePrograme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class SortCoustomObject{

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();


        person.add(new Person("govardhan","naik",30));

        person.add(new Person("bhaskar","naik",56));
        person.add(new Person("nagamunemma","naik",40));

        Collections.sort(person, (Comparator<Person>) (P1, P2) -> Integer.compare(P1.age,P2.age));

        System.out.println("sorting age "+person);

    }
}
