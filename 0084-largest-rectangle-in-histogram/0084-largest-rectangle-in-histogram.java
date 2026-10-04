class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack=new ArrayDeque<>();
        int MaxArea=0;
        for(int i=0;i<=heights.length;i++){
            int currentHeight=(i==heights.length)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>currentHeight){
                int bar_height=heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }
                else{
                    width=i-stack.peek()-1;
                }
                MaxArea=Math.max(MaxArea,width*bar_height);
            }
            if(i<heights.length){
                stack.push(i);
            }
        }
        return MaxArea;
    }
}