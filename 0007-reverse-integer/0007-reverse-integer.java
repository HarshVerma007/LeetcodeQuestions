class Solution {
    public int reverse(int x) {
        int temp,rev=0;   
        while(x!=0)
        {
            temp=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            rev=rev*10+temp;
            x=x/10;
        }
        return rev;
    }
}