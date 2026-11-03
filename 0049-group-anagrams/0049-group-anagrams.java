class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        int j=0;
        int[] freq=new int[26];
        for(int k=0;k<strs.length;k++){
            String s=strs[k];
            Arrays.fill(freq,0);
            for(char ch:s.toCharArray()){
                freq[ch -'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append('#').append(freq[i]);
            }
            String key=sb.toString();
            if(mp.containsKey(key)){
                int index=mp.get(key);
                ans.get(index).add(s);
            }
            else{
                List<String> List=new ArrayList<>();
                List.add(s);
                ans.add(List);
                mp.put(key,j);
                j++;
            }
        }
        return ans;
    }
}