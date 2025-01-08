class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count =0;
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            for(int j=i+1;j<words.length;j++)
            {
                String given = words[j];
                
                if(given.startsWith(word) && given.endsWith(word))
                count++;
            }
        }
        return count;
    }
}