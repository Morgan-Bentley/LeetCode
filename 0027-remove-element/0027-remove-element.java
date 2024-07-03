class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int j = 0;
        int[] numsCopy = new int[k];
        for(int i = 0; i < k; i++) {
            if(val != nums[i]) {
                numsCopy[j++] = nums[i];
            }
        }
        
        k = j;
        
        for(int i=0;i<k;i++) {
            nums[i] = numsCopy[i];
        }
        return k;
    }
}