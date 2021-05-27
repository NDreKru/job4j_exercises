package collections.map;

import java.util.Map;

/** 5. Изменение уже существующей записи в отображении.
 *Задание: метод принимает два отображения, которые имеют одинаковый размер:
 * 1. Ключ - тип Integer, значение - тип String. При этом значение - это Имя,
 * ключ - возрастающая последовательность, начиная с 1
 * 2. Ключ - тип Integer, значение - тип String. При этом значение - это Фамилия,
 * ключ - возрастающая последовательность, начиная с 1
 * Необходимо пройтись по первому отображению и к значению имени добавить значение фамилии,
 * чтобы на выходе получилось отображение - ключ(число) - значение(строка - имя + фамилия).
 */

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (Integer key : name.keySet()) {
            name.computeIfPresent(key, (k, v) -> v + " " + surname.get(k));
        }
        return name;
    }
}
