package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        int sum;

        HashMap<Integer, Integer> hashNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashNums.put(i, nums[i]);
        }

        for (Map.Entry<Integer, Integer> i : hashNums.entrySet()) {
            for (int nums_index = i.getKey() + 1; nums_index < nums.length; nums_index++) {
                sum = i.getValue() + nums[nums_index];

                if (sum == target) {
                    indexes[0] = i.getKey();
                    indexes[1] = nums_index;
                    return indexes;
                }
            }
        }

        return indexes;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        int[] result = twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}
