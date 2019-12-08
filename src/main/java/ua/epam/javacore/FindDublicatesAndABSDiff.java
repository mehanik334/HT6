package ua.epam.javacore;

public class FindDublicatesAndABSDiff {

    public boolean findDublicatesAndABSDiffIndex(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}

