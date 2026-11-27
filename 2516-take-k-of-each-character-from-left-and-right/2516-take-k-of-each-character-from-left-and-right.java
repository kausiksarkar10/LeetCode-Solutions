class Solution {
    public int takeCharacters(String s, int k) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                a++;
            }
            else if(ch=='b'){
                b++;
            }
            else{
                c++;
            }
        }
        
        if(a<k ||b<k ||c<k){
            return -1;
        }
        int max=0;
        int[] window=new int[3];
        int left=0;
        for(int right=0;right<s.length();right++){

            window[s.charAt(right)-'a']++;

            while(window[0]>a-k || window[1]>b-k ||window[2]>c-k){
                window[s.charAt(left)-'a']--;
                left++;
            }
            
            max=Math.max(max,right-left+1);
        }
        return s.length()-max;
    }
}