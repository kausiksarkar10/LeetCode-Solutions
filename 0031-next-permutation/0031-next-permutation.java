class Solution {
    public void nextPermutation(int[] nums) {
        int pivotIndex=-1;
        int right = nums.length-1;
        while(right>0){
            if(nums[right]>nums[right-1]){
                pivotIndex=right-1;
                break;
            }
            right--;

        }
        if(pivotIndex==-1){
            reverse(nums,0,nums.length-1);
        }
        else{
            int ElementGreaterthanPivotfromRight=-1;
            right = nums.length-1;
            while(right>=0){
                if(nums[pivotIndex]<nums[right]){
                    ElementGreaterthanPivotfromRight=right;
                    break;
                }
                right--;
            }
            swap(nums,pivotIndex,ElementGreaterthanPivotfromRight);
            reverse(nums,pivotIndex+1,nums.length-1);
        }


    }
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void swap(int[] nums,int left,int right){

            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

        
        
       
    }
}