class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    int n = nums.length;
    int[]arr = new int[n];
    int evenindex=0,oddindex=1;
    for(int i=0;i<n;i++)
    {
        int num = nums[i];
        if(num%2==0)
        {
            arr[evenindex] = nums[i];
            evenindex=evenindex+2;
        }
        else{
            arr[oddindex] = nums[i];
            oddindex=oddindex+2;
        }
    }
    return arr;
}
}
