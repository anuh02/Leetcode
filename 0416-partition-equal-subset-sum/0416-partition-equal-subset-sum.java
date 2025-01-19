class Solution {
    public boolean canPartition(int[] nums) {
        int tsum = 0;
        for (int num : nums) {
            tsum += num;
        }

        // If the total sum is odd, it's impossible to partition into two equal subsets
        if (tsum % 2 == 1) {
            return false;
        }

        int target = tsum / 2;

        // Only a single DP array is needed
        boolean[] prev = new boolean[target + 1];
        prev[0] = true; // A subset sum of 0 is always possible

        // Initialize for the first element
        if (nums[0] <= target) {
            prev[nums[0]] = true;
        }

        // Fill the DP table iteratively
        for (int i = 1; i < nums.length; i++) {
            boolean[] cur = new boolean[target + 1];
            cur[0] = true; // A subset sum of 0 is always possible

            for (int t = 1; t <= target; t++) {
                boolean notTake = prev[t];
                boolean take = false;
                if (nums[i] <= t) {
                    take = prev[t - nums[i]];
                }

                cur[t] = take || notTake;
            }

            prev = cur; // Move to the next iteration
        }

        return prev[target];
    }
}
