class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> ng = new ArrayList<>();
        int ans [] = new int[n];

        for(int num : nums)
        {
            if(num >= 0)
            p.add(num);
            else
            ng.add(num);

        }
        int a =0, b=0;
        for(int i=0;i<n;i++)
        {
            if(i % 2 == 0)
            {
                ans[i] = p.get(a);
            a++;
            }
            else
            {
                ans[i] = ng.get(b);
                b++;
            
            }
        }
        return ans;

    }
}