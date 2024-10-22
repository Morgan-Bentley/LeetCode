class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new LinkedList<>();
        backtracker(combs,new LinkedList<Integer>(), n, k, 1);
        return combs;
    }
    
    public void backtracker(List<List<Integer>> combs,List<Integer> cand,int n,
                            int k,int start){
        if(cand.size()==k){
            combs.add(new LinkedList<>(cand));
            return;
        }
        for(int i=start;i<=n;i++){
            cand.add(i);
            backtracker(combs,cand,n,k,i+1);
            cand.remove(cand.size()-1);
        }
        return;
    }
}