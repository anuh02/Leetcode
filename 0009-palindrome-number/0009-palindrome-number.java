class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        return false;
        return (x == reverse(x)) ;
    }

    public int reverse(int a)
    {
        
        int rev = 0;
        int rem = 0;
        while(a != 0)
        {
            rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;

        }
        return rev;
    }
}