package collections.map;

import java.util.*;

/**
 * 7. Найти символ который используется в строке наибольшее количество раз
 *
 * Метод принимает строку, которая может содержать несколько пробелов,
 * однако в ней отсутствуют знаки препинания.
 * Необходимо реализовать метод, который вернет символ в строке, который употребляется наибольшее количество раз.
 * Если окажется что таких символов несколько - необходимо вернуть первый из символов.
 * Чтобы обеспечить сортировку символов - собирайте исходную строку в TreeMap(), в которой ключ - это символ,
 * значение - количество. Перед тем как собирать строку ее нужно привести к нижнему регистру, удалить пробелы.
 * Для того, чтобы собрать строку в отображение используйте методы computeIfPresent() и putIfAbsent() -
 * первый обновит значение частотности употребления символа, второй - вставит пару ключ(символ) значение(1) -
 * если такого символа в отображении еще нет.
 */
public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> treeMap = new TreeMap<>();
        char rsl = ' ';
        char[] charArray = str.toLowerCase(Locale.ROOT).replace(" ", "").toCharArray();
        for (char c : charArray) {
            treeMap.computeIfPresent(c, (k, v) -> v + 1);
            treeMap.computeIfAbsent(c, v -> 1);
        }
        int maxCount = Collections.max(treeMap.values());
        for (Map.Entry<Character, Integer> characterIntegerEntry : treeMap.entrySet()) {
            if (characterIntegerEntry.getValue() == maxCount) {
                rsl = characterIntegerEntry.getKey();
                break;
            }
        }
        return rsl;
    }
}