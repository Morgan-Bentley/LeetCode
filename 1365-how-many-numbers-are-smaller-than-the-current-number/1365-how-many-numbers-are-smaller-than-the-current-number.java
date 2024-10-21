class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.value-a.value);
        int[] answer=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair(nums[i],i));
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            map.put(p.value,map.get(p.value)-1);
            answer[p.index]=pq.size()-map.get(p.value);
        }
        return answer;
    }
    
    class Pair{
    int value;
    int index;
    Pair(int v,int i){
        value=v;
        index=i;
    }
}
}