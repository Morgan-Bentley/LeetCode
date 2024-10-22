class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int minLength=Integer.MAX_VALUE;
        int currSum=nums[right];
        while(right<nums.length && minLength>1){
            if(currSum>=target){
                minLength=Math.min(right-left+1,minLength);
                currSum-=nums[left];
                left++;
            } else if ((right+1)<nums.length) {
                right++;
                currSum+=nums[right];
            } else {
                break;
            }
        }
        return minLength>nums.length? 0 : minLength;
    }
}