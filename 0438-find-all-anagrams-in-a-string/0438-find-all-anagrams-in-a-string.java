class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return ans;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<p.length();i++){
            char ch=s.charAt(i);
            freq1[ch - 'a']++;
        }
        for(char ch:p.toCharArray()){
            freq2[ch -'a']++;
        }
        if(isEqual(freq1,freq2)){
            ans.add(0);
        }
        int left=0;
        for(int right=p.length();right<s.length();right++){
            char ch=s.charAt(right);
            char ch1=s.charAt(left);
            freq1[ch -'a']++;
            freq1[ch1 - 'a']--;
    
            if(isEqual(freq1,freq2)){
                ans.add(left+1);
            }
            left++;
        }
        return ans;
    }
    public boolean isEqual(int[] freq1,int[] freq2){
        for(int i=0;i<freq2.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}