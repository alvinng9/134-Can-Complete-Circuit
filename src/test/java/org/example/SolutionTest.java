package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void canCompleteCircuitTest() {
        Solution solution = new Solution();
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5 ,1 ,2};
        Assert.assertEquals(3, solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5},
                                                                   new int[]{3, 4, 5 ,1 ,2}));

        Assert.assertEquals(-1, solution.canCompleteCircuit(new int[]{2,3,4},
                                                                   new int[]{3,4,3}));
    }
}