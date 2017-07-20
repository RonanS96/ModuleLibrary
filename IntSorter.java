import java.util.Arrays;

/**
 * A number of algorithms that can be used to sort arrays of integers.
 * Pseudocode was obtained from 'VisuAlgo.net'. All other sources 
 * used have been referenced when necessary.
 * 
 * @author Ronan Smith
 * @date 11.07.17
 */

public class IntSorter 
{
	public IntSorter(int[] array)
	{
		/* Uncomment below 1 by 1 for testing. */
		//bubbleSort(array);	// :)
		//selectionSort(array); // :)
		//insertionSort(array); // :)
		//mergeSort(array);		// :|
		
		quickSort(array, 0, array.length-1);		// :)
		System.out.println("Result of Quick Sort:");
		System.out.println("" + Arrays.toString(array));
		
		//flip(array);			// :)
		//findMax(array);		// :)
		//findMin(array);		// :)
	}
	
	/** Bubble Sort.
	 *  
	 *  Repeatedly steps through an unsorted list of elements and compares 
	 *  adjacent elements in the list.  At each stage, if the element on the
	 *  right is smaller than the element on the left then they are swapped.
	 *  The last element is marked as sorted at each stage and the algorithm 
	 *  is complete when all elements are sorted. 
	 *  
	 *  @param arr - the array to be sorted.
	 *  @return arr - the sorted array. 
	 */
	public int[] bubbleSort(int[] arr)
	{
		boolean swapped = true;
		
		while (swapped)
		{
			swapped = false;
			for (int i = 0; i < arr.length-1; i++)
			{
				if (arr[i] > arr[i + 1])
				{
					swap(i,i+1, arr);
					swapped = true;
				}
			}
		}
		
		System.out.println("Result of Bubble Sort:");
		System.out.println("" + Arrays.toString(arr));
		return arr;
	}
	
	/** Swap two elements at indexes a and b in an array arr. 
	 *  
	 *  @param a - the first index to be swapped
	 *  @param b - the index to be swapped with the first.
	 *  @param arr - the array in which these indexes exist.
	 *  @return arr - the array with indexes a and be swapped.
	 */
	public int[] swap(int a, int b, int[] arr)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		return arr;
		
	}
	
	/** -------------------Bubble Sort----------------------- */
	
	/** Selection Sort
	 * 
	 *  At each stage the algorithm marks the smallest element in the
	 *  unsorted sublist then moves it to its correct position in the 
	 *  list (i.e the beginning).  
	 *  
	 *  @param arr - the array to be sorted.
	 *  @return arr - the sorted array.
	 */
	public int[] selectionSort(int[] arr)
	{
		int min;
		int minDex = -1;
		int i, j;
		
		for(i = 0; i < arr.length; i++)
		{
			min = arr[i];
			for (j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < min)
				{
					min = arr[j];
					minDex = j;
					swap(i, minDex, arr);
				}
			}
		}
		
		System.out.println("Result of Selection Sort:");
		System.out.println("" + Arrays.toString(arr));
		return arr;
	}
	
	/** -------------------Selection Sort----------------------- */
	
	/** Insertion Sort
	 * 
	 *  For each unsorted element, extract that element, then 
	 *  find its place in the left hand side (sorted) list.
	 *  This is done by checking each element from right to left
	 *  (from the current element) and if the current element is 
	 *  smaller that the one to its left then the larger element 
	 *  is shifted one place to the right. 
	 *   
	 *  This module has been copied and modified from the following URL:
	 *  http://mathbits.com/MathBits/Java/arrays/InsertionSort.htm and 
	 *  was last accessed on 12.07.17.  The copied version carried out
	 *  insertion sort giving the result in descending order.  My solution
	 *  for this problem was to make a call to my 'flip' function at the 
	 *  end of this one. 
	 *  
	 *  @param arr - the array to be sorted. 
	 *  @return arr - the sorted array.
	 */
	public int[] insertionSort(int[] arr)
	{
		 int j, i, temp;

	     for (j = 1; j < arr.length; j++)    
	     {
	          temp = arr[j];
	          for(i = j - 1; (i >= 0) && (arr[i] < temp); i--)   
	          {
	                 arr[i+1] = arr[i];
	          }
	         arr[i+1] = temp;    
	     }
	     
	     flip(arr);
	     
	     System.out.println("Result of Insertion Sort:");
		 System.out.println("" + Arrays.toString(arr));
		 return arr;
	}
	
	
	/** -------------------Insertion Sort----------------------- */
	
	/** Merge Sort
	 * 
	 *  A divide and conquer technique which recursively breaks up the 
	 *  array/list into partitions then solves each partition individually 
	 *  before merging it with the next one.
	 *  
	 *  @param arr - the array to be sorted. 
	 *  
	 *  *********************** TO BE COMPLETED ***************************
	 */
	public void mergeSort(int[] arr)
	{
		int n = arr.length;
		if(n < 2) return;
	
		/* Divide into 2 partitions */
		int middle = n/2;
		int[] p1 = Arrays.copyOfRange(arr, 0, middle);
		int[] p2 = Arrays.copyOfRange(arr, middle, n);
		
		/* Merge Sort each of the partitions */
		mergeSort(p1);
		mergeSort(p2);
		
		/* Merge the results */
		merge(p1,p2,arr);
		
		System.out.println("Result of Merge Sort:");
		System.out.println("" + Arrays.toString(arr));
		//return arr;
	}
	
	/** Merge or combine two separate lists of integers
	 * 
	 * @param arr1 - the first partition to be merged
	 * @param arr2 - the second partition to be merged
	 * @param arr  - the original array before splitting.
	 *
	 * ************ TO BE COMPLETED *********************
	 */
	public void merge(int[] arr1, int[] arr2, int[] arr)
	{
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		int i = 0, j = 0;
		while((i < arr1.length) && (j < arr2.length))
		{
			if(arr1[i] <= arr2[j])
			{
				arr[i+j] = arr1[i];
				i++;
			}
			else
			{
				arr[i+j] = arr2[j];
				j++;
			}
		}
	}
	
	/** -------------------Merge Sort----------------------- */
	
	/** Quick Sort
	 *  
	 *  A divide and conquer algorithm which is known for being fast.
	 *  At each stage, choose a 'pivot' element, then split the array 
	 *  into three parts; First part: all elements less than the pivot
	 *  value, Second Part: the pivot element itself; Third Part: all 
	 *  elements with a value greater than the pivot.  In this case the 
	 *  pivot will always be the middle element in the array.
	 * 
	 *  This method has been taken and modified from the following URL:
	 *  http://www.programcreek.com/2012/11/quicksort-array-in-java/
	 *  Last accessed: 14.07.17
	 * 
	 *  @param arr  - the unsorted array.
	 *  @return arr - the sorted array.
	 *  
	 */
	public void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				swap(i, j, arr);
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	
	
	/** Reverse an array. I.e [1, 2, 3] becomes [3, 2, 1].
	 *  This can be done using the 'swap' function defined above.
	 *  At each step swap the current element with the element
	 *  opposite it in the list. If there are an odd number of
	 *  elements the middle one will never need to move. 
	 */
	public int[] flip(int[] arr)
	{
		int i = 0;
		int j = arr.length - 1;
		
		while (i < j)
		{
			swap(i, arr.length-1-i, arr);
			i++;
			j--;
		}
		
		/* Uncomment below for testing */
		//System.out.println("Result of Flip:");
		//System.out.println("" + Arrays.toString(arr));
		return arr;
	}
	
	/** findMax
	 *  
	 *  Find and return the largest integer value in the array.
	 *  @param arr - the array to be searched.
	 *  
	 */	
	public int findMax(int[] arr)
	{
		int i;
		int max = arr[0];
		for(i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Result of FindMax:");
		System.out.println("The maximum value is: " + max);
		return max;
	}
	
	/** findMin
	 *  
	 *  Find and return the smallest integer value in the array.
	 *  @param arr - the array to be searched.
	 *  
	 */	
	public int findMin(int[] arr)
	{
		int i;
		int min = arr[0];
		for(i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Result of FindMin:");
		System.out.println("The smallest value is: " + min);
		return min;
	}
}
