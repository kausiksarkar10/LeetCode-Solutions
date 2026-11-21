class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int Score=0;
        int maxScore=0;
        Arrays.sort(tokens);
        if(tokens.length==0||tokens[0]>power ){
            return 0;
        }
        int left=0;
        int right=tokens.length-1;
        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left];
                Score++;
                maxScore=Math.max(maxScore,Score);
                left++;
            }
            else if(power<0){
                return maxScore;
            }
            else{
                power+=tokens[right];
                right--;
                Score--;
            }

        }
        return maxScore;
    }
}