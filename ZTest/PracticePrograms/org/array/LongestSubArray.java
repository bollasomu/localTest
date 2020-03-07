package org.array;

public class LongestSubArray {

	static int longestSubSeg(int arr[], int arrayLength,  
			int k) 
	{ 
		int cnt0 = 0; 
		int l = 0; 
		int max_len = 0; 

		// i decides current ending point 
		for (int i = 0; i < arrayLength; i++) { 
			if (arr[i] == 0) 
				cnt0++; 

			// If there are more 0's move 
			// left point for current ending 
			// point. 
			while (cnt0 > k) { 
				if (arr[l] == 0) 
					cnt0--; 
				l++; 
			} 

			int temp_max_len = max_len;
			int two = i-l+1;
			max_len = Math.max(temp_max_len, two); 
		} 

		return max_len; 
	} 

	//Driver code 
	public static void main (String[] args) 
	{ 
		//int a[] = { 1, 0, 0, 1, 0, 1, 0, 1 }; 
		//int[] a = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}; k=3
		int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2; 
		int arrayLength = arr.length; 
		System.out.println( longestSubSeg(arr, arrayLength, k)); 

	} 
}