class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[] = new int [A.length];
        HashMap<Integer, Integer> hpa = new HashMap<>();
        HashMap<Integer, Integer> hpb = new HashMap<>();
        int c =0;
        for(int i = 0;i < ans.length ; i++)
        {
            if(hpa.containsKey(A[i] ))
            {
                hpa.put(A[i], hpa.get(A[i] + 1));
            }
            hpa.put(A[i],1);

            if(hpb.containsKey(B[i] ))
            {
                hpb.put(A[i], hpb.get(B[i] + 1));
            }
            hpb.put(B[i],1);

            for (Map.Entry<Integer,Integer> elem : hpa.entrySet())
            {
                int keyA = elem.getKey();
                int freqA = elem.getValue();
                int freqB = hpb.getOrDefault(keyA,0);
                if(freqA == freqB)
                c++;
            }
            
           ans[i] = c;
           c=0;
           
        } 
        return ans;
    }
}