class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstpos=first(nums,target);
        int lastpos=last(nums,target);
        return new int[]{firstpos,lastpos};
    }
    public int first(int[] nums,int target){
        int ans=-1,left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    public int last(int[] nums,int target){
    int ans=-1,left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}