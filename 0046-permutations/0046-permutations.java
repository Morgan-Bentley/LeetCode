class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new LinkedList<>();
        backtracker(perms, new LinkedList<>(), nums);
        return perms;
    }
    
    public void backtracker(List<List<Integer>> perms, List<Integer> cand, int[] nums){
        if(cand.size()==nums.length){
            perms.add(new LinkedList<>(cand));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            int element=nums[i];
            if(cand.contains(element)) continue;
            cand.add(element);
            backtracker(perms,cand,nums);
            cand.remove(cand.size()-1);
        }
        return;
    }
}