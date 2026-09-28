class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int num:hs){
            if(!hs.contains(num-1)){
                int currentlongest=1;
                while(hs.contains(num+1)){
                    currentlongest++;
                    num++;
                }
                longest=Math.max(currentlongest,longest);
            }
        }
        return longest;
    }
}