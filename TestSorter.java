import java.util.Arrays;

/**
 * Test the IntSorter class with different test integer arrays.
 * 
 * @author Ronan Smith
 * @date 11.07.17
 */

public class TestSorter 
{	
	public static void main(String[] args)
	{
		int[] arr1 = {10,9,8,7,6,5,4,3,2,1,0};
		int[] arr2 = {34,21,64,7,99,100,20,3,1,6};
		int[] arr3 = {55,66255242,8991,4,77};
		int[] arr4 = {-21, -1, 5, -4, 8, 100};
		
		System.out.println("Test Started...");
		
		System.out.println("Testing array 1: " + Arrays.toString(arr1));
		IntSorter i = new IntSorter(arr1);
		System.out.println("");
		
		System.out.println("Testing array 2: " + Arrays.toString(arr2));
		IntSorter i2 = new IntSorter(arr2);
		System.out.println("");
		
		System.out.println("Testing array 3: " + Arrays.toString(arr3));
		IntSorter i3 = new IntSorter(arr3);
		System.out.println("");
		
		System.out.println("Testing array 4: " + Arrays.toString(arr4));
		IntSorter i4 = new IntSorter(arr4);
		System.out.println("");
	}
}
