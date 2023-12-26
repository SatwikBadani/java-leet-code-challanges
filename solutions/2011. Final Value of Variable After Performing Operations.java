/**
 * 2011. Final Value of Variable After Performing Operations
 *
 * [LeetCode - The World's Leading Online Programming Learning Platform](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/)
 */
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a = 0;
        for(String o : operations){
            if(o.charAt(0)=='+' || o.charAt(2)=='+') a++;
            else a--;
        }
        return a;
    }
}