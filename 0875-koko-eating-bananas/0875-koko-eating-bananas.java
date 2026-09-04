class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int num:piles){
            right=Math.max(right,num);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canfinish(piles,mid,h)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean canfinish(int[] pile,int speed,int h){
        int hours=0;
        for(int num:pile){
            hours+=Math.ceil((double) num/speed);
        }
        return hours<=h;
    }
}