class Solution {
    public int numIslands(char[][] nums) {
        int islands=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j]=='1') {
                    islandCount(nums,i,j);
                    islands++;
                } 
            }
        }
        return islands;
    }
    
    public static void islandCount(char[][] nums,int i,int j){
        if(i<0||j<0||i>=nums.length||j>=nums[0].length||nums[i][j]=='0'){
            return;
        } else {
            nums[i][j]='0';
            islandCount(nums,i-1,j);
            islandCount(nums,i+1,j);
            islandCount(nums,i,j-1);
            islandCount(nums,i,j+1);
        }
    }
}