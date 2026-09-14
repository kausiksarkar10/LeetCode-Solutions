class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int i : weights){
            left=Math.max(left,i);
            right=right+i;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canShip(weights,mid,days)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean canShip(int[] weights,int mid,int days){
        int d=1;
        int remaining=mid;
        for(int i=0;i<weights.length;i++){
            remaining=remaining-weights[i];
            if(remaining >= 0){
                continue;
            }
            else{
                d++;
                remaining=mid;
                remaining=remaining-weights[i];
            }
        }
        return days>=d;
    }
}