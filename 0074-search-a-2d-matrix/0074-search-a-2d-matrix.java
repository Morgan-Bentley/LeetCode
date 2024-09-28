class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int max = (rows*cols)-1;
        int min=0;
        int m=(max-min)/2;
        int colm = m%cols;
        int rowm = m/cols;
        while(matrix[rowm][colm]!=target&&max>min){
            if(matrix[rowm][colm]>target){
                max = m-1;
                m=min+(max-min)/2;
                colm = m%cols;
                rowm = m/cols;
            } else if(matrix[rowm][colm]<target){
                min = m+1;
                m=min+ (max-min)/2;
                colm = m%cols;
                rowm = m/cols;
            }
        }
        return matrix[rowm][colm]==target? true: false;
    }
}