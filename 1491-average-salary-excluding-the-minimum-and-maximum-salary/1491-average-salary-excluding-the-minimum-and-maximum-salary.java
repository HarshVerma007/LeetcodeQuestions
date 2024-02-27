class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double  avg=0;
        double total=0;
        int n = salary.length;
        for(int i=1;i<n-1;i++)
        {
            total = total + salary[i];
        }
        avg = total/(n-2);
        return avg;
    }
}