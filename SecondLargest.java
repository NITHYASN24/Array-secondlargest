package week1.day2;

import java.util.Arrays;

public class SecondLargest	 {
		
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,9,8,5,10,3};
			
		Arrays.sort(arr);
		
		int SecondLargest= arr.length-2;
		System.out.println("secondlargest is:" +arr[SecondLargest]);
		
	
		
	}

}
