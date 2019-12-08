package ua.epam.javacore;

import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class FindDublicatesTest {

    private FindDublicates findDublicates = new FindDublicates();
    private int[] arr = {1,2,3};

    @Test
    public void convertArrToSetTestTrue() {
        Set<Integer> set = findDublicates.convertArrToSet(arr);
        boolean flag = false;
        for(int i = 0; i<arr.length;i++) {
            if(set.contains(Integer.valueOf(arr[i]))) {
                flag = true;
            }else {
                flag = false;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void convertArrToSetTestFalse() {
        Set<Integer> set = findDublicates.convertArrToSet(arr);
        boolean flag = false;
        for(int i = 0; i<arr.length;i++) {
            if(set.contains(Integer.valueOf(arr[i]))) {
                flag = true;
            }else {
                flag = false;
            }
        }
        Assert.assertFalse(flag);
    }
}
