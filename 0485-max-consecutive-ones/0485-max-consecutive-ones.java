class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++)
        {
             if(nums[i] == 1)
             c++;   
             if(nums[i] == 0)
             {
                
                maxi = Math.max(maxi,c);
                c = 0;
             }
        }
        maxi = Math.max(maxi,c);
        return maxi;
    }
}