class Solution {
    public int longestConsecutive(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            int maxIdx=0;
            for(int j=0;j<=i;j++){
                if(nums[j]>nums[maxIdx]){
                    maxIdx=j;
                }
            }

            int temp=nums[i];
            nums[i]=nums[maxIdx];
            nums[maxIdx]=temp;

        }

        int maxCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                count=1;
            }else{
                if(nums[i]-nums[i-1]==1){
                    count++;
                }else if(nums[i]-nums[i-1]>1){
                    count=1;
                }
            }
            if(count>maxCount){
                maxCount=count;
            }
        }

        return maxCount;
    }
}
