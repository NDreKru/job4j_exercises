package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 12. Индексы символов
 *
 * Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные.
 * При реализации необходимо игнорировать пробелы во входной строке.
 * Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки,
 * а значением - список индексов, под которыми этот символ (если таких символов несколько) входит в исходную строку.
 * Важно: строчные и прописные символы считаются разными символами.
 */
public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        String fStr = s.replace(" ", "");
        for (int i = 0; i < fStr.length(); i++) {
            char key = fStr.charAt(i);
            if (rsl.containsKey(key)) {
                rsl.get(key).add(i);
            }
            rsl.putIfAbsent(key, new ArrayList<>(List.of(i)));
        }
        return rsl;
    }
}
