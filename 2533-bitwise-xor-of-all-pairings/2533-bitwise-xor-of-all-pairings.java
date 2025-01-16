class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans1 = 0;
        int ans2 = 0;
        if(nums1.length % 2 == 1)
        {
            for(int num : nums2)
            {
                ans1 ^= num;
            }
        }

        if(nums2.length % 2 == 1)
        {
            for( int num : nums1)
            {
                ans2 ^= num;
            }
        }

        return ans1 ^ ans2;
    }
}