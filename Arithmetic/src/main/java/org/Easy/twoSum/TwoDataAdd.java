package org.Easy.twoSum;

/**
 * @description: 两数相加
 * @author: Xsj
 * @create: 2022-06-19 15:53
 **/
public class TwoDataAdd {


    /**
     * 题目说明:给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * 示例：
     *     输入：l1 = [2,4,3], l2 = [5,6,4]
     *     输出：[7,0,8]
     *     解释：342 + 465 = 807.
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        throw new RuntimeException("两数相加异常");
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
