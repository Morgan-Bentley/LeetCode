class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int element: nums){
            xor^=element;
        }
        return xor;
    }
}