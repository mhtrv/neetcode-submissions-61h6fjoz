class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outputs = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    //System.out.println("i:"+nums[i]+" j:"+nums[j]+" k:"+nums[k]);
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        Boolean isUnique= true;
                        int ind=0;
                        while(ind<outputs.size() && isUnique){
                            if(list1.get(0)==outputs.get(ind).get(0) 
                            && list1.get(1)==outputs.get(ind).get(1)
                            && list1.get(2)==outputs.get(ind).get(2)
                            ){
                               isUnique=false;
                            }
                            ind++;
                        }
                        if (isUnique){
                            //System.out.println("adding "+nums[i]+" "+nums[j]+" "+nums[k]);
                            outputs.add(list1);
                        }
                    }
                }
            }
        }

        return outputs;
    }
}
