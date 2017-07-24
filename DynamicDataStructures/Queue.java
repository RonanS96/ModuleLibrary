/** Array based implementation of a queue.
 * 
 *  A queue is a first in, first out abstract data structure.
 *  This example uses a static data type to store its elements
 *  (an array) and therefore has a maximum size.
 *  
 *  TO BE COMPLETED...
 *  
 *  @author Ronan Smith
 *  @date 20.07.17
 */

package DynamicDataStructures;

public class Queue implements QueueIF
{
	private static int MAX_QUEUE_SIZE = 30;
	private int first = 0, last = 0, size = 0;
	private int[] arr = new int[MAX_QUEUE_SIZE];

	public Queue()
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = -1;
		}
	}
	
	/** Print the size of the queue (the number of 
	 *  elements).
	 * 
	 *  @return size.
	 */
	@Override
	public int size() 
	{
		if(first == last)
		{
			return 0;
		}
		else
		{
			return size;
		}
	}

	/** Check if the queue is empty.
	 * 
	 *  @return true  - if queue is empty
	 *  @return false - if queue is nonempty
	 */
	@Override
	public boolean isEmpty() 
	{
		if(first == last)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/** Return the value of the element at the front of the queue.
	 *  
	 *  @return arr[first]
	 */
	@Override
	public int first() 
	{
		return arr[first];
	}

	/** Add an element to the back of the queue.
	 */
	@Override
	public void enqueue(int element) 
	{
		if(last == arr.length - 1)
		{
			System.out.println("Queue is full, cannot add.");
		}
		else
		{
			arr[last] = element;
			last++;
			size++;
		}
	}

	/** Remove the element at the front of the queue.
	 *  
	 *  @return result
	 */
	@Override
	public int dequeue() 
	{
		if(arr[first] == -1)
		{
			System.out.println("Cannot dequeue from an empty list.");
			return -1;
		}
		else
		{
			int result = arr[first];
			arr[first] = -1;
			first ++;
			size--;
			System.out.println("Dequeued " + result);
			//for(int i = 1; i < arr.length; i++)
			//{
				//shift(i);
			//}
			return result;
		}
	}

	/** Print all the queue elements in the format
	 *  [element1, element2, element3, ... ]
	 * 
	 *  @return arr - the array storing the elements.
	 */
	public int[] printQueue()
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != -1)
			{
				System.out.print("" + arr[i]);
			}
			if(((i != arr.length - 1) && (arr[i + 1] != -1)) && (i != first - 1))
			{
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
		
		return arr;
	}
	
	public int[] shift(int i)
	{
		arr[i - 1] = arr[i];
		
		return arr;
	}
}
