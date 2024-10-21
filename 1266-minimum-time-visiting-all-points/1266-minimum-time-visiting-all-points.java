class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length==1)return 0;
        int time=0;
        for(int i=1;i<points.length;i++){
            int dif1=Math.abs(points[i][0]-points[i-1][0]);
            int dif2=Math.abs(points[i][1]-points[i-1][1]);
            time+=Math.min(dif1,dif2)+Math.abs(dif1-dif2);
        }
        return time;
    }
}