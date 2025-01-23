class Solution {
    public int[] plusOne(int[] digits) {
        //int n = digits.length;
        //int d[]= new int[n];
        //int num = 0;
       for(int i = digits.length-1;i >= 0;i--)
       {
        if(digits[i] < 9)
        {
            digits[i]++;
            return digits;
       }
       digits[i] = 0;
       }

       digits = new int[digits.length + 1];
       digits[0] = 1;

        return digits;
    }
}