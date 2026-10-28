class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long maxIndex=-1;
        long minIndex=-1;
        int i=0;
        long ans=0;
        long culpritIndex=-1;
        while(i<nums.length){
            if(nums[i]<minK || nums[i]>maxK){
                culpritIndex=i;
            }
            if(nums[i]==minK){
                minIndex=i;
            }
            if(nums[i]==maxK){
                maxIndex=i;
            }
            long temp=0;
            long minimum = Math.min(minIndex,maxIndex);
            temp+=minimum-culpritIndex;
            if(temp>0){
                ans+=temp;
            }
            else{
                ans+=0;
            }
            i++;
        }
        return ans;
    }
}