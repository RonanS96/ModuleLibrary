package DynamicDataStructures;

public class TestQueue 
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		
		System.out.println("Test started...");
		
		System.out.println("Check if queue is empty...");
		if(q.isEmpty())
		{
			System.out.println("Queue is empty.");
		}
		else
		{
			System.out.println("Queue is non-empty.");
		}
		
		System.out.println("Attempting to populate queue...");
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(7);
		q.enqueue(7);
		q.enqueue(7);
		q.enqueue(83);
		
		q.printQueue();
		System.out.println("The size of the queue is: " + q.size());
		
		System.out.println("The first element is: " + q.first());
		//System.out.println("The last element is: " + q.last());
		
		System.out.println("Check if queue is empty...");
		if(q.isEmpty())
		{
			System.out.println("Queue is empty.");
			System.out.println("");
		}
		else
		{
			System.out.println("Queue is non-empty.");
			System.out.println("");
		}
		
		for(int i = 0; i < 50; i++)
		{
			q.enqueue(i);
		}
		
		System.out.println("Result:");
		q.printQueue();
		
		System.out.println("Dequeuing elements...");
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println("Result:");
		q.printQueue();
		
		System.out.println("The first element is: " + q.first());
		//System.out.println("The last element is: " + q.last());
		
		System.out.println("Pushing 78 and 45");
		q.enqueue(78);
		q.enqueue(45);
		q.printQueue();
		
		// clear the queue
		while(q.first() != -1)
		{
			q.dequeue();
		}
		q.printQueue();
	}
}
