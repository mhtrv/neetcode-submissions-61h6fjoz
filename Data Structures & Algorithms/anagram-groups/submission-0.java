class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outputs =new ArrayList<>();
        List<Map<Character,Integer>> list1=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            Map<Character,Integer> map1=new HashMap<>();
            String string1=strs[i];
            for(int j=0;j<string1.length();j++){
                Character char1=string1.charAt(j);
                if(map1.containsKey(char1)){
                    Integer count=map1.get(char1);
                    count++;
                    map1.put(char1, count);
                }else{
                    map1.put(char1, 1);
                }
            }

            int j=0;
            boolean found=false;
            while(!found && j<list1.size()){
                //System.out.println(list1.get(j));
                found=true;
                if(map1.size()==list1.get(j).size()){
                    Iterator iterator = list1.get(j).keySet().iterator();
                    //System.out.println(iterator.next());
                    while(found && iterator.hasNext()){
                        //System.out.println(iterator.next().getClass());
                        Character key=(Character)iterator.next();
                        if(map1.get(key)!=list1.get(j).getOrDefault(key,0)){
                           found=false;
                        }
                    }
                }else{
                    found=false;
                }
                if(found){
                    List output=outputs.get(j);
                    output.add(string1);
                }
                j++;
            }

            if(!found){
                List output=new ArrayList<>();
                output.add(string1);
                outputs.add(output);
                list1.add(map1);
            }

        }

        return outputs;  
    }
}
