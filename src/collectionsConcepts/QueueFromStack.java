package collectionsConcepts;

import java.util.Stack;

public class QueueFromStack {

	public void push(Stack<Integer> stack)
	{
		for(int i=1;i<10;i++)
		{
			stack.push(i);
		}
		System.out.println(stack);
		
	}
	
	public void pop(Stack<Integer> stack1, Stack<Integer> stack2)
	{
		while(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		System.out.println(stack2);
	}
	
	/*public void queue(Stack<Integer> stack3, Stack<Integer> stack2)
	{
		while(stack3.isEmpty())
		{
			while(!stack2.isEmpty())
			{
				stack3.push(stack2.pop());
			}
		}
		}
		*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		QueueFromStack q=new QueueFromStack();
		q.push(stack1);
		q.pop(stack1, stack2);
		
		

	}

}
