package Leetcode;
class l_1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int temp = pq.remove();
            int temp2 = pq.remove();
            int ans = temp - temp2;
            pq.add(ans);
        }
        return pq.peek();
    }
}