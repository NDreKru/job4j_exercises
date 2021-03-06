package collections.List;

import java.util.*;

public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element has - " + true + ", this element is " + iterator.next());
        }
        System.out.println("Next element has - " + false);
    }
}

