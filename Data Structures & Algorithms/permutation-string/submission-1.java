class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map1=new HashMap<>();
        int s1Count = 0;
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i), 0)+1);
            s1Count++;
        }
        //for(Map.Entry<Character,Integer>entry :map1.entrySet()){
        //    System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        //}

        Map<Character,Integer> map2=new HashMap<>();
        LinkedList<Character> list1 = new LinkedList<>();
        for(int i=0;i<s2.length();i++){
            //System.out.println(s2.charAt(i));
            if(!map1.containsKey(s2.charAt(i))){
                map2.clear();
                list1.clear();
            }else{
                if(map2.getOrDefault(s2.charAt(i), 0)<map1.get(s2.charAt(i))){
                    map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i), 0)+1);
                    list1.add(s2.charAt(i));
                    if(list1.size()==s1Count){
                        return true;
                    }
                }else{
                    boolean bool = true;
                    while(bool){
                        char char1=list1.removeFirst();
                        if(char1==s2.charAt(i)){
                            bool=false;
                            list1.add(s2.charAt(i));
                        }else{
                            int count=map2.get(char1);
                            if(count>1){
                                map2.put(char1,map2.get(char1)-1);
                            }else{
                                map2.remove(char1);
                            }
                        }
                    }
                }
            }
        }

        return false;
    }
}
