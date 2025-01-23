class Solution {
    public void sortColors(int[] nums) {
        int l =0, m =0, h = nums.length-1;
        while(m <= h)
        {
            int x = nums[m];
            if(x == 0)
            {
                int tmp = nums[l];
                nums[l] = nums[m];
                nums[m] = tmp;

                l++;
                m++;

            }
            else if(x == 1)
            m++;

            else
            {
                int tmp = nums[m];
                nums[m] = nums[h];
                nums[h] = tmp;

                h--;
            }
        }
        
    }
}