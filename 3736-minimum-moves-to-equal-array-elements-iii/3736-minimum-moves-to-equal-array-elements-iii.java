class Solution {
    public int minMoves(int[] nums) {
        int max_value=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max_value<nums[i]){
                max_value=nums[i];
            }
        }


        return max_value*nums.length-sum;
    }
}