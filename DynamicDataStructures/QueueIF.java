package DynamicDataStructures;

public interface QueueIF<E> 
{
	int size();
	boolean isEmpty();
	E first();
	void enqueue();
	E dequeue();
}
