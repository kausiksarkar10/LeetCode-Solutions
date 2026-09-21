class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        if((long)m*k>bloomDay.length){
            return -1;
        }
        for(int i:bloomDay){
            left=Math.min(left,i);
            right=Math.max(right,i);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(isPossible(bloomDay,mid,k,m)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean isPossible(int[] bloomDay,int day,int k,int m){
        int minB=0;
        int count=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    minB++;
                    count=0;
                }

            }
            else{
                count=0;
            }
        }
        return m<=minB;
    }
}