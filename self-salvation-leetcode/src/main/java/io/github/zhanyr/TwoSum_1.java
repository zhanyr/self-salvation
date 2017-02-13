package io.github.zhanyr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhanyr
 * @Create 2017-02-06 6:10 PM
 * @Desc
 *
 * 1.Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum_1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwoSum_1.class);

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                indexes[0] = map.get(target - nums[i]);
                indexes[1] = i;
                return indexes;
            } else {
                map.put(nums[i], i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        TwoSum_1 twoSum = new TwoSum_1();
        int[] nums = {1, 6, 3, 8, 4};
        int target = 9;
        System.out.println(twoSum.twoSum(nums, target)[0] + "," + twoSum.twoSum(nums, target)[1]);
    }
}