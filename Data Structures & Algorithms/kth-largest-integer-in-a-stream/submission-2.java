class KthLargest {

    int k;
    List<Integer> nums;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=new ArrayList<>();
        for(int i=nums.length-1;i>=nums.length-k && i>=0;i--){
            //System.out.println(i);
            int maxIdx=0;
            for(int j=0;j<=i;j++){
                if(nums[j]>nums[maxIdx]){
                    maxIdx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[maxIdx];
            nums[maxIdx]=temp;
            this.nums.add(nums[i]);
        }

        //for(int i=0;i<this.nums.size();i++){
        //    System.out.println(this.nums.get(i));
        //}
    }
    
    public int add(int val) {
        //System.out.println("Adding val:"+val);
        boolean swap=false;
        if(this.nums.size()<k){
            this.nums.add(val);
            swap=true;
            //System.out.println("Adding element in if loop");
        }else if(val>this.nums.get(k-1)){
            this.nums.set(k-1,val);
            swap=true;
            //System.out.println("Adding element in else loop");
        }

        int i=k-1;
        while(swap && i>0){
            if(this.nums.get(i)>this.nums.get(i-1)){
                int temp=this.nums.get(i-1);
                this.nums.set(i-1,this.nums.get(i));
                this.nums.set(i,temp);
            }
            i--;
        }
        return this.nums.get(k-1);
    }
}
