package io.github.zhanyr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhanyr
 * @Create 2017-02-10 4:40 PM
 * @Desc
 *
 * 3.Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class LengthOfLongestSubstring_3 {
    private static final Logger LOGGER = LoggerFactory.getLogger(LengthOfLongestSubstring_3.class);

    public int lengthOfLongestSubstring(String s) {
        if (null == s || "".equals(s.trim())) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        int tmp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                tmp = tmp > (map.get(s.charAt(i)) + 1) ? tmp : (map.get(s.charAt(i)) + 1);
            }
            max = i - tmp + 1 > max ? (i - tmp + 1) : max;
            map.put(s.charAt(i), i);

        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring_3 substring = new LengthOfLongestSubstring_3();
        System.out.println(substring.lengthOfLongestSubstring(""));
        System.out.println(substring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(substring.lengthOfLongestSubstring("bbbbb"));
        System.out.println(substring.lengthOfLongestSubstring("pwwkew"));
        System.out.println(substring.lengthOfLongestSubstring("abcd"));
        System.out.println(substring.lengthOfLongestSubstring("dvdf"));

    }
}