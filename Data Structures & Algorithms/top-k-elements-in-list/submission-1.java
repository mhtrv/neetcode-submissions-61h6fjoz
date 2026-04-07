class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                map1.put(nums[i], map1.get(nums[i])+1);
            }else{
                map1.put(nums[i], 1);
            }
        }

        Queue <Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer key: map1.keySet()){
            //System.out.println("Key: "+key+" Value:"+map1.get(key));
            queue1.add(map1.get(key));
        }
        int i=0;
        while(i<k-1){
            Integer int1 =queue1.poll();
            //System.out.println("Polling:"+int1);
            i++;
        }
        int min = queue1.poll();
        //System.out.println("Min:"+min);

        List<Integer> list1 = new ArrayList<>();
        for(Integer key: map1.keySet()){
            if(map1.get(key)>=min){
                list1.add(key);
            }
        }

        int[] output =new int[k];
        for(int j=0;j<k;j++){
            output[j]=list1.get(j);
        }
        return output;
    }
}
