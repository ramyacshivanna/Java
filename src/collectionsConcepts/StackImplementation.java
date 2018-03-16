package collectionsConcepts;

import java.util.Stack;

public class StackImplementation {
	
	public void stack_push(Stack<Integer> stack)
	{
		//pushing elements on top of stack
	 for(int i=0;i<5;i++)
	 {
		 stack.push(i);
		 System.out.print(stack.get(i) + " " );
	 }
	}
	
	public void stack_pop(Stack<Integer> stack)
	{
		System.out.println();
		System.out.println("******");
		//poping elements from stacks
		for(int i=0;i<5;i++)
		{
			Integer y=(Integer) stack.pop();
			System.out.print(y + " ");
		}
	}

	// Displaying element on the top of the stack	
	public void stack_peek(Stack<Integer> stack)
	{
		System.out.println();
		System.out.println("******");
		Integer element=(Integer) stack.peek();
		System.out.println(element + " ");
		
	}
	
	//searching an element in stack and return the position of it
	public void stack_search(Stack<Integer> stack, int number)
	{
		System.out.println();
		System.out.println("******");
		Integer position=(Integer) stack.search(number);
		if( position == -1)
		{
			System.out.println(number + " is not present in stack");
		}
		else
		{
			System.out.println(number + " is found at position : " + position);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation obj=new StackImplementation();

		Stack<Integer> stack=new Stack<Integer>();
		obj.stack_push(stack); //push 
		obj.stack_pop(stack); //pop all
		
		obj.stack_push(stack); //push
		obj.stack_peek(stack); //peek last element
		
		obj.stack_search(stack, 2);
		obj.stack_search(stack, 6);
		
		
		
		
		
		
	}

}
