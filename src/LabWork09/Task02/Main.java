package LabWork09.Task02;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Set<T> result = new HashSet<>(collection);
        return result;
    }

    public static void main(String[] args) {

        Collection<String> cStrings = List.of("bmw", "hongqi", "bmw", "mercedes", "hongqi", "opel");

        Collection<String> cUniqueStrings = removeDuplicates(cStrings);

        System.out.println("Unique elements: " + cUniqueStrings);
    }
}
