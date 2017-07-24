/** 
 * Searching algorithms to find integers inside arrays.
 * 
 * @author Ronan Smith
 *
 */
public class IntSearcher 
{	
	/** Linear Search. Complexity O(n).
	 * 
	 * 	Search for an integer in the array by going through
	 *  each element one by one, and checking at each stage
	 *  if that element equals the int we are looking for.
	 *  This algorithm is useful for small lists but very slow
	 *  when used on large lists.
	 * 
	 *  @param a - the array to be searched
	 *  @param s - the integer being searched for
	 *  @return found - true if int exists in the list else false.
	 */
	public boolean linearSearch(int[] a, int s)
	{
		boolean found = false;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == s)
			{
				System.out.println("Integer " + s + " found at index " + i + " in array " + printArray(a));
				found = true;
			}
		}
		
		if(found == false)
		{
			System.out.println("Integer " + s + " not found in array " + printArray(a));
		}
		
		return found;
	}
	
	/** Binary Search. Complexity O(log n).
	 * 
	 * 	A divide and conquer search method which works on ORDERED lists.  
	 *  At each stage the middle element or 'pivot' is compared with the search integer s. 
	 *  There are 3 possibilities. If s is smaller than the number at a[pivot] then the 
	 *  lower half of the list is searched. If it is greater then the top half of the list is 
	 *  searched, and if the pivot element holds the result then it is marked as being found.
	 *  
	 *  Binary search is more suited than linear search for large lists with lots of elements.
	 * 
	 * 	@param a 	 - the array to be searched - MUST BE IN ASCENDING ORDER.
	 * 	@param s 	 - the integer value being searched for.
	 *  @param first - the first index of a (usually zero).
	 *  @param last  - the final index of the array (array.length - 1)
	 * 	@return      - true if value is found else false.
	 */
	public boolean binarySearch(int[] a, int s, int first, int last)
	{
		int pivot;
		
	    pivot = (first + last)/2;
	    
	    if(last > a.length)
	    {
	    	System.out.println("Last > Length");
	    	System.out.println("Integer " + s + " not found.");
	    	return false;
	    }
	    if(((first == last - 1) || (last < first)) || (first == last))
	    {
	    	if(a[first] == s)
	    	{
	    		System.out.println("Integer " + s + " found at index " + first + ".");
	    		return true;
	    	}
	    	else
	    	{
	    		System.out.println("Integer " + s + " not found.");
	    		return false;
	    	}
	    }
	    if(a[pivot] == s)
	    {
	    	System.out.println("Integer " + s + " found at index " + pivot + ".");
	    	return true;
	    }
	    if(a[pivot] < s)
	    {
	    	binarySearch(a, s, pivot, last);
	    }
	    else if(a[pivot] > s)
	    {
	    	binarySearch(a, s, first, pivot);
	    }
		return false;
	}
	
	public String printArray(int[] a)
	{
		String result = "[";
		
		for(int i = 0; i < a.length; i++)
		{
			result = result + " " + a[i];
			if(i != a.length - 1)
			{
				result = result + ", ";
			}
		}
		
		result = result + " ].";
		
		return result;
	}
	
}
