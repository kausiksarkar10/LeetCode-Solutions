class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i]){
                int index=stack.pop();
                mp.put(nums2[index],nums2[i]);
            }
            stack.push(i);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}