package CollectionsExamplePrograme;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<>();

        hashset.add("govardhan");
        hashset.add("naik");
        hashset.add("bhavana");
        hashset.add("dharvik");
        hashset.add("hithvik");
        hashset.add("rajkumar.s");

        System.out.println("hashset"+hashset);
        System.out.println("hashset"+hashset.contains("govardhan"));
        System.out.println("name is okay"+hashset.contains("govardhan"));

        System.out.println("name is okay"+hashset.hashCode());

        Iterator iterator = hashset.iterator();





    }
}
