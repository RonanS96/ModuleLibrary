package DynamicDataStructures;

public interface QueueIF 
{
	int size();
	boolean isEmpty();
	int first();
	void enqueue(int element);
	int dequeue();
}
