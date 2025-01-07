class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i< words.length;i++)
        {
            String s = words[i];
            for(int j = 0;j< words.length;j++)
            {
                if(s.equals(words[j]))
                continue;
                
                if(s.contains(words[j]) && !ans.contains(words[j]))
                {
                    ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}