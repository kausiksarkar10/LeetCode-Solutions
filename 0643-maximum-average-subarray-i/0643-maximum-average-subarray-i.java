class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int Max=Integer.MIN_VALUE;
        double average;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        Max=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            Max=Math.max(sum,Max);
        }
        average = (double)Max/k;
        return average;
    }
}