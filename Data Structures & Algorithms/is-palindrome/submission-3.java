class Solution {
    public boolean isPalindrome(String s) {
        String sanitised="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sanitised=sanitised+s.charAt(i);
            }
        }

        sanitised=sanitised.toLowerCase();
        System.out.println(sanitised.length());

        int pointer2 =sanitised.length()-1;
        for(int i=0;i<sanitised.length()/2;i++){
            System.out.println(i+""+pointer2);
            //System.out.println(sanitised.charAt(i));
            if(!(sanitised.charAt(i)==sanitised.charAt(pointer2))){
                return false;
            }
            pointer2--;
        }

        return true;
    }
}
