class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        if(nums.length == 1)
        return nums[0];
        for(int i = 0;i< nums.length;i++)
        {
            sum += nums[i];

                ans = Math.max(ans,sum);

            if(sum <0)
            sum = 0;

            
        }
        return ans;
        
    }
}