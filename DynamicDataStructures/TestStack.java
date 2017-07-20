/** Test class to test the Stack class.
 * 
 *  @author Ronan Smith
 *  @date 17.07.17
 */
package DynamicDataStructures;

public class TestStack 
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		
		System.out.println("Test started...");
		
		System.out.println("Check if stack is empty...");
		if(s.isEmpty())
		{
			System.out.println("Stack is empty.");
		}
		else
		{
			System.out.println("Stack is non-empty.");
		}
		
		System.out.println("Attempting to populate stack...");
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(7);
		s.push(7);
		s.push(7);
		s.push(83);
		
		s.printStack();
		System.out.println("The size of the stack is: " + s.size());
		
		System.out.println("The top element is: " + s.top());
		
		System.out.println("Check if stack is empty...");
		if(s.isEmpty())
		{
			System.out.println("Stack is empty.");
			System.out.println("");
		}
		else
		{
			System.out.println("Stack is non-empty.");
			System.out.println("");
		}
		
		for(int i = 0; i < 50; i++)
		{
			s.push(i);
		}
		
		System.out.println("Result:");
		s.printStack();
		
		System.out.println("Popping elements...");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("Result:");
		s.printStack();
		
		System.out.println("The top element is: " + s.top());
		
		System.out.println("Pushing 78 and 45");
		s.push(78);
		s.push(45);
		s.printStack();
		
		// clear the stack
		while(s.top() != -1)
		{
			s.pop();
		}
		s.printStack();
	}
}
