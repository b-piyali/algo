package piyali.dsa.leetcode.min_cost_climbing_stairs_746;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length == 1)
            return cost[0];
        else if (cost.length == 2)
            return Math.min(cost[0], cost[1]);
        else {
            for (int i = 2; i < cost.length; i++) {
                //updating the cost with min of previous two
                cost[i] += Math.min(cost[i - 1], cost[i - 2]);
            }
        }
        //returning the min cost from last two
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
