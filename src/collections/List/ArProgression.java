package collections.List;

import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        boolean isProgression = true;
        int sum = 0;
        ListIterator<Integer> lIterator = data.listIterator();
        while (lIterator.nextIndex() < data.size() - 2) {
            int left = lIterator.next();
            int middle = lIterator.next();
            int right = lIterator.next();
            if ((left + right) / 2 != middle) {
                isProgression = false;
                break;
            }

        }
        if (isProgression) {
            for (int n : data) {
                sum += n;
            }
        }
        return sum;
    }
}
