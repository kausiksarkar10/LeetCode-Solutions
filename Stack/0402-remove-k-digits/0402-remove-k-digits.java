class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= num.length(); i++) {
            int digit = (i == num.length()) ? Integer.MIN_VALUE : num.charAt(i) - '0';

            while (!stack.isEmpty() && stack.peek() > digit && k > 0) {
                stack.pop();
                k--;
            }

            if (i < num.length()) {
                stack.push(digit);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        String str=sb.toString();
        return str.length()==0?"0":str;
    }
}