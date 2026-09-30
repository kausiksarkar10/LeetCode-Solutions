class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(hm.containsKey(sch)){
                if(hm.get(sch)!=tch){
                    return false;
                }
            }
            else if(hm.containsValue(tch)){
                return false;
            }
            else{
                hm.put(sch,tch);
            }
        }
        return true;
    }
}