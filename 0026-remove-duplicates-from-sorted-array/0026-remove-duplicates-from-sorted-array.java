class Solution {
    public int removeDuplicates(int[] nums) {
        int [] expectedNums = new int[nums.length];
        int prevPos=0; 
        expectedNums[0]=nums[0];
        for(int num : nums) {
            if(num == expectedNums[prevPos]) {
                continue;
            }
            expectedNums[++prevPos]=num;
            nums[prevPos]=num;
        }
        return prevPos+1;
    }
}