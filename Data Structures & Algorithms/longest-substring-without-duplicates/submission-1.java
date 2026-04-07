class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int curr=0;
        List<Character> set1=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(set1.contains(s.charAt(i))){
                while(set1.getFirst()!=s.charAt(i)){
                    set1.removeFirst();
                }
                set1.removeFirst();
            }
            set1.add(s.charAt(i));
            if(set1.size()>max){
                max=set1.size();
            }
        }
        
        return max;
    }
}
