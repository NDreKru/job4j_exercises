package collections.List;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>(count);
        int sum = first;
        list.add(first);
        for (int i = 1; i < count; i++) {
            int element = (int) Math.ceil(first * Math.pow(denominator, i));
            list.add(i, element);
            sum += list.get(i);
        }
        return sum;
    }
}
