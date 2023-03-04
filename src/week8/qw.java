package week8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class qw {

    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];
        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            set.add(random.nextInt(100) - random.nextInt(100));// [1,2,3,4,5]
        }
        while (set.size() < n) {
            int a = random.nextInt(100) - random.nextInt(100);
            if (sum(set) + a == 0) {
                set.add(a);
            }
        }
        System.out.println((set));

    }

    private static int sum(Set<Integer> set) {
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }
        return sum;
    }
}
