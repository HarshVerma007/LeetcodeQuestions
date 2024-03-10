class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int l=nums2.length;
        int count=0;
        int[] arr = new int[Math.min(n,l)];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    boolean Isduplicate = false;
                    for(int k=0;k<count;k++){
                        if(arr[k] == nums1[i])
                        {
                            Isduplicate = true;
                            break;
                        }
                    }
                    if(!Isduplicate)
                    {
                        
                        arr[count++] = nums1[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(arr,count);
    }
}