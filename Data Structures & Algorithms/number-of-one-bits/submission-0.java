class Solution {
    public int hammingWeight(int n) {
        List<Integer> list1=new ArrayList<>();

        while(n>0){
            int power = (int) (Math.log(n)/Math.log(2));
            n=n-(int) Math.pow(2,power);
            list1.add(power);
        }

        return list1.size();
    }
}
