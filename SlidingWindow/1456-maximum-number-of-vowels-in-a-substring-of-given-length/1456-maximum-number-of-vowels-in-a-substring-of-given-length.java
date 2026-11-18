class Solution {
    public int maxVowels(String s, int k) {
        int maxlen=0;
        int max=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxlen++;
                max=Math.max(maxlen,max);
            }
        }
        int left=0;
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(left);
            char ch1=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxlen--;
                
            }
            left++;
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
                maxlen++;
            }
            max=Math.max(maxlen,max);

            
        }
        return max;
    }
}