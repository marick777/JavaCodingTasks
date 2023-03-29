package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class AscOrder {

    public static void sortAscending(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // swap elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        sortAscending(new ArrayList<Integer>(Arrays.asList(1,5,9,8,7,6,3,2,5,6,7)));
    }
}
