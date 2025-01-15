class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1) return nums[0]; 
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Create two scenarios
        List<Integer> l1 = new ArrayList<>(list.subList(0, nums.length - 1)); // Exclude last house
        List<Integer> l2 = new ArrayList<>(list.subList(1, nums.length));     // Exclude first house

        
        int ans = solve(l1);
        int ans2 = solve(l2);
        return Math.max(ans, ans2);
    }

    static int solve(List<Integer> l)
    {
        int n = l.size();
        int prev = l.get(0);
        int prev2 = 0;

        for(int i=1;i<n;i++)
        {
            int pick = l.get(i);
            if(i > 1)
            pick += prev2;

            int npick = 0 + prev;

            int curi =  Math.max(pick , npick);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}