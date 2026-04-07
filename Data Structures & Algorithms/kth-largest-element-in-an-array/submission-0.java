class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i=nums.length-1;i>=nums.length-k;i--){
            int maxInd=0;
            for(int j=0;j<=i;j++){
                if(nums[j]>nums[maxInd]){
                    maxInd=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[maxInd];
            nums[maxInd]=temp;
        }
        //for(int i=0;i<nums.length;i++){
        //    System.out.println(nums[i]);
        //}
        return nums[nums.length-k];
    }
}
