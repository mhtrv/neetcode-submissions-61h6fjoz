class MinStack {
    
    LinkedList<Integer> list1;

    public MinStack() {
        list1=new LinkedList<>();
    }
    
    public void push(int val) {
        list1.addFirst(val);
    }
    
    public void pop() {
        list1.removeFirst();
    }
    
    public int top() {
        return list1.get(0);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int val:list1){
            if(val<min){
                min=val;
            }
        }
        return min;
    }
}
