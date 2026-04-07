class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int currProduct=0;
            for(int j=i;j<nums.length;j++){
                if(i==j){
                    currProduct=nums[j];
                }else{
                    currProduct*=nums[j];
                }
                if(currProduct>maxProduct){
                    maxProduct=currProduct;
                }
            }
        }
        return maxProduct;
    }
}
