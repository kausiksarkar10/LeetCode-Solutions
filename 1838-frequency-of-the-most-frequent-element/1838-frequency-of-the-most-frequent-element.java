class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left=0;
        int MostFreqElement=0;
        long sum=0;
        Arrays.sort(nums);
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while((long)nums[right]*(right-left+1)-sum>k){
                sum-=nums[left];
                left++;
            }
            MostFreqElement=Math.max(MostFreqElement,right-left+1);
        }
        return MostFreqElement;
    }
}