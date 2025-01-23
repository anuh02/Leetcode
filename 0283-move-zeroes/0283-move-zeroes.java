class Solution {
    public void moveZeroes(int[] nums) {
        int c_zero = 0;
        int demo[] = new int[nums.length];
    int a = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            c_zero++;
            else
            {
                demo[a] = nums[i];
                a++;
            }
        }
        for(int i=0;i<a;i++)
        {
            nums[i] = demo[i];

        }
        for(int i =a ;i<a+c_zero;i++)
        {
            nums[i] = 0;
        }

    }
}