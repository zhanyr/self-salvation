package io.github.zhanyr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2017-02-06 10:38 PM
 * @Desc
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddTwoNumbers.class);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode listNode1 = null;
        int sum;
        int sum1 = 0;
        int sum2;
        while (null != l1 || null != l2 || sum1 != 0) {
            if (null == l1 && null != l2) {
                sum = l2.val + sum1;
                l2 = l2.next;
            } else if (null == l2 && null != l1) {
                sum = l1.val + sum1;
                l1 = l1.next;
            } else if (null != l1 && null != l2) {
                sum = l1.val + l2.val + sum1;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                sum = sum1;
            }
            sum1 = sum / 10;
            sum2 = sum % 10;
            if (null == listNode1) {
                listNode1 = new ListNode(sum2);
                listNode = listNode1;
            } else {
                ListNode listNodeTmp = new ListNode(sum2);
                listNode1.next = listNodeTmp;
                listNode1 = listNodeTmp;
            }

        }

        return listNode;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(4);
        ListNode listNode13 = new ListNode(3);
        listNode12.next = listNode13;
        listNode11.next = listNode12;

        ListNode listNode21 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        ListNode listNode23 = new ListNode(4);
        listNode22.next = listNode23;
        listNode21.next = listNode22;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(listNode11, listNode21);
        System.out.println(listNode);


        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode listNodeddd = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNodeddd);


    }
}
