class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> combs=new LinkedList<>();
        for(int i=0;i<=nums.length;i++){
            helper(new LinkedList<Integer>(),combs,nums,i,0);
        }
        return combs;
    }
    
    public void helper(List<Integer> candidate,List<List<Integer>> combs, int[] nums,
                       int curSize, int start) {
        if(candidate.size()==curSize){
            combs.add(new LinkedList<>(candidate));
            return;
        }
        for(int i=start;i<nums.length;i++){
            int element=nums[i];
            candidate.add(element);
            helper(candidate,combs,nums,curSize,i+1);
            candidate.remove(candidate.size()-1);
        }
        return;
    }
}