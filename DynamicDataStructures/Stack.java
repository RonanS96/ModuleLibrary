/** Array based implementation of a Stack.
 *  A stack is a dynamic data structure which can be interacted
 *  with using a few simple operations. Elements can be pushed 
 *  onto and removed from the top position in the stack. This 
 *  version of stack implementation has a maximum size since it 
 *  uses an array to store its items. It also deals with positive
 *  integers.
 *  
 *  @author Ronan Smith
 *  @date   14.07.17
 */
package DynamicDataStructures;

public class Stack implements StackIF
{
	private static int MAX_STACK_SIZE = 100;
	private int[] arr = new int[MAX_STACK_SIZE];
	private int[] arr2;
	private int top = -1;
	
	/** Stack constructor. Creates a new array to store the 
	 *  elements of the stack and gives each element an initial 
	 *  value of -1.
	 */
	public Stack()
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = -1;
		}
	}
	
	/** Return the current size of the stack.  This is equivalent 
	 *  to the value of top + 1.
	 *  
	 *  @return top + 1.
	 */
	@Override
	public int size() 
	{
		return top + 1;
	}
	
	/** Check if the stack is currently empty.
	 *  This is true when the top element is equal to -1.
	 * 
	 *  @return true  - if the stack is empty.
	 *  @return false - if the stack is not empty. 
	 */
	@Override
	public boolean isEmpty() 
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;	
		}
	}
	
	/** Return the value of the element on top of the
	 *  stack.
	 * 
	 *  return arr[top].
	 */
	@Override
	public int top() 
	{
		if(top == -1)
		{
			return -1;
		}
		else
		{
			return arr[top];
		}
	}
	
	/** Add a new element to the top of the stack and
	 *  increase the value of the top pointer by one.
	 */
	@Override
	public void push(int element) 
	{
		if(top == MAX_STACK_SIZE - 1)
		{
			arr2 = new int[MAX_STACK_SIZE * 2];
			
			for(int i = 0; i < arr.length; i++)
			{
				arr2[i] = arr[i];
			}
			
			arr2[top + 1] = element;
			top++;
		}
		else
		{
			arr[top + 1] = element;
			top++;
		}
	}
	
	/** Remove the top element from the stack and reduce the top
	 *  pointer by one position.
	 *  
	 *  @return result - if the stack is nonempty.
	 */
	@Override
	public int pop() 
	{
		if(top == -1)
		{
			System.out.println("Can't pop an empty stack.");
			return 0;
		}
		else
		{
			int result = arr[top];
			arr[top] = -1;
			top--;
			return result;
		}
	}

	/** Print each element in the stack 1 by 1 in the format
	 *  [element1, element2, element3, ...].  Any one of the 
	 *  array elements that are not -1 are elements of the stack.
	 *  
	 *  @return arr - the array storing the stack elements.
	 */
	public int[] printStack()
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != -1)
			{
				System.out.print("" + arr[i]);
			}
			if((i != arr.length - 1) && (arr[i + 1] != -1))
			{
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
		
		return arr;
	}

}
