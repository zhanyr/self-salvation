package io.github.zhanyr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2017-02-13 11:52 AM
 * @Desc
 *
 * 5.Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 *
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring_5 {
    private static final Logger LOGGER = LoggerFactory.getLogger(LongestPalindromicSubstring_5.class);

    public String longestPalindrome(String s) {

        return null;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring_5 palindromicSubstring = new LongestPalindromicSubstring_5();
        String s = "babad";
        System.out.println(palindromicSubstring.longestPalindrome(s));
    }

}