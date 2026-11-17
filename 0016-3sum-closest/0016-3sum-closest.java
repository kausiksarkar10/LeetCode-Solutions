class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentClosest=nums[i]+nums[left]+nums[right];
                if(Math.abs(currentClosest-target)<Math.abs(closest-target)){
                    closest=currentClosest;
                }
                else if(currentClosest>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return closest;
    }
}