/** Read in a text file.  To use this class you must create a text
 *  file and store it in the top of the project directory. The name 
 *  of the test file can be changed on line 16.
 *  
 *  @author Ronan Smith
 *  @date 25.09.17
 */

package TxtFileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class TxtFileReader 
{
	private static String DATASET = "testfile.txt";
	private static int populationSize = 0;
		
	public static void readDataset()
	{
		BufferedReader br = null;
		String line = null;
		
		try
		{
			br = new BufferedReader(new FileReader(DATASET));
			
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args)
	{
		readDataset();
	}

}
