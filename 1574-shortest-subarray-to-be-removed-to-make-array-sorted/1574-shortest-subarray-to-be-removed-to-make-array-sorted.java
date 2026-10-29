class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<arr.length-1 && arr[left]<=arr[left+1]){
            left++;
        }
        if(left==arr.length-1){
            return 0;
        }
        while(right>0 && arr[right]>=arr[right-1]){
            right--;
        }

        int ans=0;
        ans=Math.min(arr.length-left-1 , right);

        int i=0;
        int j=right;

        while(i<=left && j<arr.length){
            if(arr[i]<=arr[j]){
                ans=Math.min(j-i-1,ans);
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}