package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 5. Джекпот в казино
 *
 * Выигрышной комбинацией для джекпота в казино считается такая, в которой все элементы одинаковые.
 * Метод принимает массив строк, который содержит последовательность элементов игровой комбинации.
 * Метод должен вернуть true - если комбинация является выигрышной.
 * Напомню, что коллекция Set не допускает наличие дубликатов.
 * Поэтому если все элементы массива добавить в коллекцию типа Set,
 * то размер коллекции будет равен 1 при условии, что комбинация выигрышная.
 */
public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> check = new HashSet<>(Arrays.asList(combination));
        return check.size() == 1;
    }
}
