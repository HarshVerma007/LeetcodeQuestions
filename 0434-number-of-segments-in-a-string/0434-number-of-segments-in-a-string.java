class Solution {
    public int countSegments(String s) {
        char[] cArray = s.toCharArray();
        int count =0;
        for(int i=0;i<cArray.length;i++)
        {
            if(cArray[i]!=' '&& (i == 0 || cArray[i - 1] == ' '))
            {
                count++;
            }
        }

        return count;
    }
}