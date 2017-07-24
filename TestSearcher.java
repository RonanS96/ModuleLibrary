/** Test the class IntSearcher with some example integer arrays.
 *  These include positive and negative ints.
 * 
 *  @author Ronan Smith
 *  @date   11.07.17
 *
 */
public class TestSearcher 
{
	public static void main(String[] args)
	{
		IntSorter iS = new IntSorter();
		
		System.out.println("Test Started...");
		System.out.println("");
		
		int[] arr1 = {10,9,8,7,6,5,4,3,2,1,0};
		int[] arr2 = {34,21,64,7,99,100,20,3,1,6};
		int[] arr3 = {55,66255242,8991,4,77};
		int[] arr4 = {-21, -1, 5, -4, 8, 100};
		int[] arr5 = {70, 85, 86, 88, 888};
		int[] arr6 = {70, 85, 86, 88, 888, -21, -1, 5, -4, 8, 100, 55, 66255242, 8991, 4, 77, 34, 21, 64, 7, 99, 100, 20, 3, 1, 6, 10, 9, 8, 7, 6, 5, 4, 3 , 2 ,1 , 0};
		
		IntSearcher s = new IntSearcher();
		
		System.out.println("Linear Search:");
		s.linearSearch(arr1, 6);
		s.linearSearch(arr2, 6);
		s.linearSearch(arr4, 6);
		s.linearSearch(arr3, 6);
		
		System.out.println("");
		System.out.println("Binary Search:");
		s.binarySearch(iS.bubbleSort(arr1), 6, 0, arr1.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 2:");
		s.binarySearch(iS.bubbleSort(arr2), 64, 0, arr2.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 3:");
		s.binarySearch(iS.bubbleSort(arr3), 6625533, 0, arr3.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 4:");
		s.binarySearch(iS.bubbleSort(arr2), 20, 0, arr2.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 5:");
		s.binarySearch(iS.bubbleSort(arr2), 100, 0, arr2.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 6:");
		s.binarySearch(iS.bubbleSort(arr2), 1, 0, arr2.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 7:");
		s.binarySearch(iS.bubbleSort(arr5), 86, 0, arr5.length -1);
		
		System.out.println("");
		System.out.println("Binary Search 8:");
		s.binarySearch(iS.bubbleSort(arr6), 86, 0, arr6.length -1);
	}
}
