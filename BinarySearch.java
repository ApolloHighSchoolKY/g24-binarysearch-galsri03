import java.util.Arrays;

/* 
Add them together and divide by two 

integer/integer=integer

1-1,000

If the number is too low when sorting through an array add 1 to the search and make it the bottom number

If the number is too high when sorting through an array minus 1 and make it the top number 

If the bottom is greater than the top it wasn’t there

Index of returns the position 

A binary search is index of
*/

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		int top = ray.length-1; 
		int bottom = 0;

	while (bottom<=top)
	{
		int middle = (bottom + top) / 2;

		if(ray[middle]==item) 
			return middle;

		if(ray[middle]<item) 
			bottom = middle + 1;

		else //(ray[middle]>item) 
			top = middle - 1;
	}

		return -1;

	}
}
