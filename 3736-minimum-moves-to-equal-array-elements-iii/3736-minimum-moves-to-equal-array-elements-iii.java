class Solution {
    public int minMoves(int[] nums) {
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max_value<nums[i]){
                max_value=nums[i];
            }
        }
        int moves=0;
        for(int i=0;i<nums.length;i++){
            moves+=max_value-nums[i];
        }
        return moves;
    }
}