class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack1=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int int1=stack1.pop();
                int int2=stack1.pop();
                int total=0;
                if(tokens[i].equals("+")){
                    total=int1+int2;
                }else if(tokens[i].equals("-")){
                    total=int2-int1;
                }else if(tokens[i].equals("*")){
                    total=int1*int2;
                }else if(tokens[i].equals("/")){
                    total=int2/int1;
                }
                System.out.println(total);
                stack1.push(total);
            }else{
                stack1.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack1.pop();
    }
}
