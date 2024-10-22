class MinStack {
    Stack<Integer> st;
    Stack<Integer> mintrack;
    public MinStack() {
        st=new Stack<>();
        mintrack=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            mintrack.push(val);
        } else {
            int min=Math.min(val,mintrack.peek());
            st.push(val);
            mintrack.push(min);
        }
    }
    
    public void pop() {
        st.pop();
        mintrack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mintrack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */