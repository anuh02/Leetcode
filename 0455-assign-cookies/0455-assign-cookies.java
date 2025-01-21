class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int l = 0, r = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        while(l < m)
        {
             if(g[r] <= s[l])
            {
                r++;
            }
             l++;
            if(r >= n) break;
        }
        return r;
    }
}