package week1.day2;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
			int[] arr = {1,2,3,4,9,8,5,10,3,9};
				
		
			
			for (int i=0;i<arr.length;i++)
			{ for (int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
				
	System.out.println("duplicate numbers:" +arr[i]);
	}
			}
}
}