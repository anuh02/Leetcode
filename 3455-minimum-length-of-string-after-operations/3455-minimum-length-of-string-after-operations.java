class Solution {
    public int minimumLength(String s) {
        if(s.length() < 3)
        return s.length();
        int freq[] = new int[26];
        Arrays.fill(freq,0);
        
        int l = s.length();
        
        for(int i =0 ;i < s.length() ;i++)
        {
            freq[s.charAt(i) - 'a']++;
            if(freq[s.charAt(i) - 'a'] != 1 && freq[s.charAt(i) - 'a'] % 2 == 1)
            l -= 2;
        }
        return l;
    }
}