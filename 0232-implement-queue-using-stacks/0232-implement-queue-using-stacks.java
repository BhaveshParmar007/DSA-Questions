class MyQueue {

   Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    public void push(int x) {
         while (!output.isEmpty())
        input.push(output.pop());
         input.push(x);
    }
    
    public int pop() {
        if(output.isEmpty() && input.isEmpty()){
	        return -1;
	    }
	   
	        while(!input.isEmpty()){
	            output.push(input.pop());
	          //  input.pop();
	        }
	      
	    return  output.pop();
    }
    
    public int peek() {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.peek();
    }
    
    public boolean empty() {
         if(output.isEmpty() && input.isEmpty()){
	        return true;
	    }
	   return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */