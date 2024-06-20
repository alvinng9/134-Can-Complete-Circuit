package org.example;

public class Main {
    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5 ,1 ,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

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