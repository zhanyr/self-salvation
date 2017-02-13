package io.github.zhanyr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2017-02-13 11:30 AM
 * @Desc
 *
 * 4.There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianSortedArrays_4 {
    private static final Logger LOGGER = LoggerFactory.getLogger(MedianSortedArrays_4.class);

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }

    public static void main(String[] args) {
        MedianSortedArrays_4 medianSortedArrays = new MedianSortedArrays_4();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3,4};
        medianSortedArrays.findMedianSortedArrays(nums1, nums2);
    }
}