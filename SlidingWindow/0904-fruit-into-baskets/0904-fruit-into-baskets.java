class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int k=2;
        int left=0;
        int max_fruits=0;
        for(int right=0;right<fruits.length;right++){
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            if(mp.size()>2){
                int remove = mp.get(fruits[left]);
                mp.put(fruits[left],remove-1);
                if(mp.get(fruits[left])==0){
                    mp.remove(fruits[left]);
                }
                left++;
            }
            max_fruits=Math.max(max_fruits,right-left+1);
        }
        return max_fruits;
    }
}