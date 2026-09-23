class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        int[] freq=new int[26];
        for(String s:strs){
            Arrays.fill(freq,0);
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                freq[ch -'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append('#').append(freq[i]);
            }
            String key=sb.toString();
            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(s);

        }
        return new ArrayList<>(hm.values());
    }
}