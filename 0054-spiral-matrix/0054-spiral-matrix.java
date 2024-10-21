class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int cstart=0;
        int cend=matrix[0].length-1;
        int rstart=0;
        int rend=matrix.length-1;
        int size=matrix.length*matrix[0].length;
        List<Integer> answer=new LinkedList<>();
        int added=0;
        while(added!=size){
            for(int i=cstart;i<=cend && (added!=size);i++){
                answer.add(matrix[rstart][i]);
                added++;
            }
            rstart++;
            for(int i=rstart;i<=rend && (added!=size);i++){
                answer.add(matrix[i][cend]);
                added++;
            }
            cend--;
            for(int i=cend;i>=cstart && (added!=size);i--){
                answer.add(matrix[rend][i]);
                added++;
            }
            rend--;
            for(int i=rend;i>=rstart && (added!=size);i--){
                answer.add(matrix[i][cstart]);
                added++;
            }
            cstart++;
        }
        return answer;
    }
}