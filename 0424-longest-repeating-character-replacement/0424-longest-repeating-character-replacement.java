class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int longest=0;
        int left=0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch -'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            while((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }


            longest=Math.max(longest,right-left+1);
        }
        return longest;
    }
}