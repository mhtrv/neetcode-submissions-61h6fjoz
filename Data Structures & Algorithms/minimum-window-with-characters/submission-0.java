class Solution {
    public String minWindow(String s, String t) {
        String output="";
        Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            int count=map1.getOrDefault(t.charAt(i), 0);
            count++;
            map1.put(t.charAt(i), count);
        }

        for(int i=0;i<s.length()-t.length()+1;i++){
            //System.out.println("i:"+i);
            if(map1.containsKey(s.charAt(i))){
                Map<Character,Integer> map2=new HashMap<>();
                int count=0;
                String option="";
                int j=i;
                Boolean isMatch=false;
                while(j<s.length() && !isMatch){
                    //System.out.println("Running while loop");
                    option+=s.charAt(j);
                    if(map1.containsKey(s.charAt(j))){
                        int charCount=map2.getOrDefault(s.charAt(j), 0);
                        if(charCount<map1.get(s.charAt(j))){
                            charCount++;
                            map2.put(s.charAt(j),charCount);
                            count++;
                        }
                        if(map2.size()==map1.size() && count==t.length()){
                            //System.out.println("Found a match"+option);
                            isMatch=true;
                        }
                    }
                    j++;
                }
                if(isMatch && (output.equals("") || output.length()>option.length())){
                    //System.out.println("New option:"+option);
                    output=option;
                }
            }
        }
        System.out.println("Length of S is:"+s.length());
        return output;
    }
}
