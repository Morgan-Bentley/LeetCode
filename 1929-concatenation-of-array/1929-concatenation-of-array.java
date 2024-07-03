class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int doubleSize = size*2;
        int[] ans = new int[doubleSize];
        for(int i=0;i<size;i++) {
            ans[i] = nums[i];
            ans[i+size] = nums[i];
        }
        return ans;
    }
}