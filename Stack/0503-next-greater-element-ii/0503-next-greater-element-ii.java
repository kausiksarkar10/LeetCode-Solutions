class Solution {
    public int[] nextGreaterElements(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length*2;i++){
            int current=nums[i%nums.length];
            while(!stack.isEmpty() && nums[stack.peek()]<current){
                mp.put(stack.pop(),current);
            }
            if(i<nums.length){
                stack.push(i);
            }
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=mp.getOrDefault(i,-1);
        }
        return ans;
    }
}