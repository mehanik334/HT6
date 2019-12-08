package ua.epam.javacore;

import org.junit.Assert;
import org.junit.Test;

public class FindDublicatesAndABSDiffTest {

    private FindDublicatesAndABSDiff dublicatesAndABSDiff = new FindDublicatesAndABSDiff();
    private int[] arr = {1,2,3,1};

    @Test
    public void findDublicatesAndABSDiffIndexTestTrue() {
        Assert.assertTrue(dublicatesAndABSDiff.findDublicatesAndABSDiffIndex(arr,3));
    }

    @Test
    public void findDublicatesAndABSDiffIndexTestFalse() {
        Assert.assertTrue(dublicatesAndABSDiff.findDublicatesAndABSDiffIndex(arr,2));
    }
}
