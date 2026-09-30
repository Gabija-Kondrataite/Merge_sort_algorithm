import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void mergeSort(List<Integer> list) {

        if (list.size() <= 1) {
            return;
        }

        int middle = list.size() / 2;

        List<Integer> left = new ArrayList<>(list.subList(0, middle));
        List<Integer> right = new ArrayList<>(list.subList(middle, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private static void merge(List<Integer> list,
                              List<Integer> left,
                              List<Integer> right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {

            if (left.get(i) <= right.get(j)) {
                list.set(k, left.get(i));
                i++;
            }
            else {
                list.set(k, right.get(j));
                j++;
            }

            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
         list.set(k, right.get(j));
         j++;
         k++;
        }
    }
}