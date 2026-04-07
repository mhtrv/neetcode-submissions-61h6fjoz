class Solution {
    public int[] countBits(int n) {
        int [] output =new int[n+1];

        for(int i=0;i<=n;i++){
            int m=i;
            List<Integer> list1=new ArrayList<>();
            while(m>0){
                int power = (int) (Math.log(m)/Math.log(2));
                m=m-(int) Math.pow(2,power);
                list1.add(power);
            }
            output[i]=list1.size();
        }

        return output;
    }
}
