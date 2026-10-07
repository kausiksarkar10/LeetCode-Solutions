import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {

        int n = nums.length;
        long sum = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        int[] left = new int[n];
        int[] right = new int[n];

        // -------- SUBARRAY MINIMUMS --------

        // Previous Smaller
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   nums[stack.peek()] > nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() &&
                   nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        // Directly subtract minimum contribution
        for (int i = 0; i < n; i++) {
            sum -= (long) nums[i] * left[i] * right[i];
        }

        // Reset
        Arrays.fill(left, 0);
        Arrays.fill(right, 0);
        stack.clear();

        // -------- SUBARRAY MAXIMUMS --------

        // Previous Greater
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        // Next Greater
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() &&
                   nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        // Directly add maximum contribution
        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * left[i] * right[i];
        }

        return sum;
    }
}