package ua.epam.javacore;

import java.util.HashSet;
import java.util.Set;

public class DistributorCandies {

    public int findKindsCandiesSister(int[] arr) {
        int countCandies = 0;
        if (arr.length > 0 && arr.length % 2 == 0) {
            Set<Integer> set = new HashSet<>(arr.length);
            for (int i : arr) {
                set.add(i);
            }
            countCandies = Math.min(set.size(), arr.length / 2);
            return countCandies;
        }
        return countCandies;
    }
}
