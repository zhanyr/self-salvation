package io.github.zhanyr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhanyr
 * @Create 2017-02-10 4:40 PM
 * @Desc
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class LengthOfLongestSubstring {
    private static final Logger LOGGER = LoggerFactory.getLogger(LengthOfLongestSubstring.class);

    public int lengthOfLongestSubstring(String s){
        if(null == s || "".equals(s.trim())){
            return 0;
        }
        int max = 0;
        int tmp = 0;

        List<Character> list = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            char elem = s.charAt(i);
            if(list.contains(elem)){
                int index = list.indexOf(elem);
                list = list.subList(index + 1, list.size());
                max = tmp > max ? tmp : max;
                tmp = list.size();
            } else {
                list.add(elem);
                tmp++;
                i++;
            }
        }
        return tmp > max ? tmp : max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
        System.out.println(substring.lengthOfLongestSubstring(""));
        System.out.println(substring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(substring.lengthOfLongestSubstring("bbbbb"));
        System.out.println(substring.lengthOfLongestSubstring("pwwkew"));
        System.out.println(substring.lengthOfLongestSubstring("abcd"));
        System.out.println(substring.lengthOfLongestSubstring("dvdf"));

    }
}