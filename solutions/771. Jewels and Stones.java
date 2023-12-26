/**
 * 771. Jewels and Stones
 *
 * [LeetCode - The World's Leading Online Programming Learning Platform](https://leetcode.com/problems/jewels-and-stones/description/)
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(char stone : stones.toCharArray()){
            if(jewels.indexOf(stone)!=-1){
                result++;
            }
        }
        return result;
    }
}