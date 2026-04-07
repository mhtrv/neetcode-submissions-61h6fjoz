class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] outputs=new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
            int j=i+1;
            while(j<temperatures.length && !(temperatures[j]>temperatures[i])){
                j++;
            }
            if(j==temperatures.length){
                outputs[i]=0;
            }else{
                outputs[i]=j-i;
            }
        }

        return outputs;
    }
}
