class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<tokens.length;i++){
            int a,b;
            if(tokens[i].equals("+")){
                a=stack.pop();
                b=stack.pop();
                stack.push(b+a);
            }
            else if(tokens[i].equals("-")){
                a=stack.pop();
                b=stack.pop();
                stack.push(b-a);   
            }
            else if(tokens[i].equals("*")){
                a=stack.pop();
                b=stack.pop();
                stack.push(b*a);
            }

            else if(tokens[i].equals("/")){
                a=stack.pop();
                b=stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }

        }
        return stack.peek();
    }
}