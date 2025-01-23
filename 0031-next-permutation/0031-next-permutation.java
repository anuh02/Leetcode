class Solution {
    public void nextPermutation(int[] nums) {
         int n = nums.length;
        int ind = -1;
         for(int i= n-2;i>=0;i--)
         {
            if(nums[i] < nums[i+1])
            {
                ind = i;
                break;
            }
         }

         if(ind == -1)
         {
            reverse(nums,0);
         }

         else
         {
            int tmp = 0;
         for(int i=n-1;i>ind;i--)
         {
            if(nums[i] > nums[ind])
            {
                tmp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = tmp;
                break;
            }
         }
         reverse(nums, ind+1);
         }
         
       
    }
     public static void reverse(int arr[], int s)
        {
            int st = s;
            int e = arr.length-1;
            while(st < e)
            {
                int tmp = arr[st];
                arr[st] = arr[e];
                arr[e] = tmp;
                st++;
                e--;
            }
        }
}