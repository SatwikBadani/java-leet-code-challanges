package com.java.leetCode.solutions;

/**
 * 1108. Defanging an IP Address
 *
 * [LeetCode - The World's Leading Online Programming Learning Platform](https://leetcode.com/problems/defanging-an-ip-address/)
 */
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
