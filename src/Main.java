import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i =0; i < 15; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        System.out.println("Generated numbers:" + list);

        MergeSort.mergeSort(list);

        System.out.println("Sorted list of numbers:" + list);
    }
}
