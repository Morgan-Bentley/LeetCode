class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<Integer> keys=new LinkedList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.count-b.count);
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            map.put(t,map.getOrDefault(t,0)+1);
            if(map.get(t)==1){
                keys.add(t);
            }
        }
        while(!keys.isEmpty()){
            int key=keys.remove();
            int count=map.get(key);
            Pair p=new Pair(count,key);
            pq.add(p);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] el=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            el[i++]=pq.remove().term;
        }
        return el;
    }
    
}

class Pair{
    int count;
    int term;
    Pair(int c,int t){
        count=c;
        term=t;
    }
}