package collectionsConcepts;

import java.util.Stack;

public class ImplementQueueUsingStack {
	
	public void push(Stack<Integer> stack)
	{
		stack.push(3);
		stack.push(5);
		stack.push(1);
		stack.push(6);
		stack.push(10);
		System.out.println(stack);
		System.out.println("size of stack " + stack.size());
	}
	
	public void Queue(Stack<Integer> stack, Stack<Integer> stack2)
	{
		System.out.println("*************************");
		
	 if(stack2.isEmpty()) {
		 while(!stack.empty()) {
			 stack2.push(stack.pop());
		 }
	 }
	 System.out.println(stack2.size());
	 System.out.println(stack2);	 
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementQueueUsingStack obj=new ImplementQueueUsingStack();
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		obj.push(stack);
		obj.Queue(stack, stack2);
		
		
		}

}
