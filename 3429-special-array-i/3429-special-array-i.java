class Solution {
    public boolean isArraySpecial(int[] nums) {
        int l = nums.length;
        int flag = 0;
        if(l==1)
        return true;
        
        for(int i=0;i<l-1;i++)
        {
            if((nums[i]%2 == 0 && nums[i+1] %2 == 1) || (nums[i]%2 == 1 && nums[i+1] %2 == 0) )
            flag = 1;
            else
            {
                flag = 0;
            break;
            }


        }
        return (flag == 0) ? false : true;
        
    }
}