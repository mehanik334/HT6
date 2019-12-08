package ua.epam.javacore;

import ua.epam.javacore.DistributorCandies;

import org.junit.Assert;
import org.junit.Test;


public class DistributorCandiesTest {

     private DistributorCandies distributorCandies = new DistributorCandies();

     @Test
     public void findKindsCandiesSisterTestTrue () {
          int[] candies = {1,1,2,3};
          int res = distributorCandies.findKindsCandiesSister(candies);
          Assert.assertEquals(2,res);
     }

     @Test
     public void findKindsCandiesSisterTestFalse () {
          int[] candies = {1,1,2,2,3,3};
          int res = distributorCandies.findKindsCandiesSister(candies);
          Assert.assertEquals(2,res);
     }
}
