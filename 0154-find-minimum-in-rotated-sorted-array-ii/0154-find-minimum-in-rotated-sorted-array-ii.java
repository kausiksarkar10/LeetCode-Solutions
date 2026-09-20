class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[left]==nums[mid]&& nums[right]==nums[mid]){
                left++;
                right--;
            }
            else if(nums[right]<nums[mid]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}