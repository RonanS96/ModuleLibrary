/** Interface for a Stack of integers.
 * 
 * 	@author Ronan Smith
 *  @date   14.07.17
 */
package DynamicDataStructures;

public interface StackIF 
{
	int size();
	boolean isEmpty();
	int top();
	void push(int element);
	int pop();
}
