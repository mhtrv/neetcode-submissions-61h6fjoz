class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> map1= new HashMap<>();
        Map<Character, Integer> map2= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i)+1));
            }else{
                map1.put(s.charAt(i), 1);
            }
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.get(t.charAt(i)+1));
            }else{
                map2.put(t.charAt(i), 1);
            }
        }
        
        for(Character curr : map1.keySet()){
            System.out.println(curr);
            System.out.println(map2.get(curr));
            if(!map2.containsKey(curr) || (map1.get(curr)!=map2.get(curr))){
                return false;
            }
        }
        return true;
    }
}
