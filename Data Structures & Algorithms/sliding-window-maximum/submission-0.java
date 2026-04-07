class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length-(k-1);i++){
            int currMax=nums[i];
            for(int j=i;j<i+k;j++){
                if(nums[j]>currMax){
                    currMax=nums[j];
                }
            }
            list1.add(currMax);
        }

        int[] outputs = new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            outputs[i]=list1.get(i);
        }
        return outputs;
    }
}
