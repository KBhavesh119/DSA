import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            h.put(num, h.getOrDefault(num, 0) + 1);

            if (h.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}
