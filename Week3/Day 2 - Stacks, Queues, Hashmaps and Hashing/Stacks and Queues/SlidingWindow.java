import java.util.*;

class SlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            // Remove out of window elements
            if (!deque.isEmpty() && deque.peek() == i - k) deque.poll();

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();

            deque.offer(i);

            if (i >= k - 1) result[i - k + 1] = nums[deque.peek()];
        }

        return result;
    }
}

