package ua.epam.javacore;

import org.junit.Assert;
import org.junit.Test;

public class FinderMissingNumTest {

    private FinderMissingNum finder = new FinderMissingNum();
    private int[] arr = {1,2,2,4};

    @Test
    public void findMissingNumInArrTestTrue() {
        int[] res = {2,3};
        Assert.assertArrayEquals(finder.findMissingNumInArr(arr),res);
    }

    @Test
    public void findMissingNumInArrTestFalse() {
        int[] res = {2,4};
        Assert.assertArrayEquals(finder.findMissingNumInArr(arr),res);
    }
}
