package org.example;

public class Solution {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;

        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }

        if (costSum > gasSum) return -1;

        int start = 0;
        int diff = 0;

        for (int i = 0; i < gas.length; i++) {
            diff += gas[i] - cost[i];

            if (diff < 0) {
                diff = 0;
                start = i + 1;
            }
        }

        return start;
    }
}
