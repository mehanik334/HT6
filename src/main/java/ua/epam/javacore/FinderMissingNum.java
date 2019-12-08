package ua.epam.javacore;

public class FinderMissingNum {

    public int[] findMissingNumInArr(int[] arr) {
        int[] resArr = new int[2];
        if (2 < arr.length && arr.length < 10000) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    resArr[0] = arr[i];
                } else {
                    if (arr[i] + 1 != arr[i + 1] && i <= arr.length - 2) {
                        resArr[1] = arr[i] + 1;
                    }
                }
            }
            return resArr;
        }
        return resArr;
    }
}
