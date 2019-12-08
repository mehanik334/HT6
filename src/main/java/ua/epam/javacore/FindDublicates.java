package ua.epam.javacore;

import java.util.*;

public class FindDublicates {

    public boolean findDublicatesInArray(int[] arr) {
        Set<Integer> integerSet = convertArrToSet(arr);
        if (integerSet.size() == arr.length) {
            return false;
        }
        return true;
    }

    public Set<Integer> convertArrToSet(int[] arr) {
        Set<Integer> setInt = new HashSet<Integer>(arr.length);
        for (int i : arr) {
            setInt.add(i);
        }
        return setInt;
    }
}
