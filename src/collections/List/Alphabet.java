package collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        char[] array = s.toCharArray();
        List<Character> characterList = new ArrayList<>(s.length());
        StringBuilder rsl = new StringBuilder();
        for (char c : array) {
            characterList.add(c);
        }
        Collections.sort(characterList);
        for (char c : characterList) {
            rsl.append(c);
        }
        return rsl.toString();
    }
}
