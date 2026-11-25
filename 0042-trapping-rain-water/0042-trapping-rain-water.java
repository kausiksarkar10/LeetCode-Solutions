class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int leftmax=0;
        int rightmax=0;
        while(left<right){
            if(height[left]<height[right]){
                leftmax=Math.max(height[left],leftmax);
                water+=leftmax-height[left];
                left++;
            }
            else{
                rightmax=Math.max(height[right],rightmax);
                water+=rightmax-height[right];
                right--;
            }

        }
        return water;
    }
}