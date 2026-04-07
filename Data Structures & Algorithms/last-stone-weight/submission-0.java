class Solution {
    public int lastStoneWeight(int[] stones) {
        int output=0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int stone1=pq.poll();
            int stone2=pq.poll();
            if(stone1>stone2){
                pq.add(stone1-stone2);
            }else if(stone2>stone1){
                pq.add(stone2-stone1);
            }
        }
        
        if(pq.size()==1){
            output=pq.poll();
        }
        return output;
    }
}
