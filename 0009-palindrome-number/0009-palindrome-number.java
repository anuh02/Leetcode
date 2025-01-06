class Solution {
    public boolean isPalindrome(int x) {
        return (x == reverse(x)) ? true: false;
    }

    public int reverse(int a)
    {
        int tmp = a;
        int rev = 1;
        int rem = 0;
        while(tmp >= 0)
        {
            rem = tmp % 10;
            rev = rev * 10 + rem;
            tmp = tmp / 10;

        }
        return rev;
    }
}