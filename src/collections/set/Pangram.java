package collections.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        String formattedStr = s.toLowerCase();
        formattedStr = formattedStr.replace(" ", "");
        char[] arr = formattedStr.toCharArray();
        Set<Character> alphabet = new HashSet<>();
        for (char c : arr) {
            alphabet.add(c);
        }
        return alphabet.size() == 26;
    }
}