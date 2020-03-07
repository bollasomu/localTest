package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArrExample {

	
	public static List<List<Integer>> result = new ArrayList<>();
	
	public static void main(String[] args) {
			
		int[] arr = {3,4,1,2,3,1,2,2,1,1};
		
		//int[] arr = {3,1,1,4};
		
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				
				sum +=arr[j];
				if(sum==7) {
					addArray(arr, i, j);
					
				}
			}
		}
		System.out.println("result "+ result);
	}
	
	public static void addArray(int[] arr,int i,int j) {
		
		/*
		 * Object[] h = IntStream.range(i,
		 * j+1).mapToObj(k->arr[k]).collect(Collectors.toList()).toArray();
		 * System.out.println("obj[] "+ Arrays.toString(h) + ",  ");
		 * 
		 * Integer[] vec1 = Arrays.copyOf(h, h.length, Integer[].class);
		 * System.out.println("int array "+ Arrays.toString(vec1));
		 */
		
		for(int s=i;s<=j;s++) {
			System.out.print(arr[s] + ", ");
		}
		System.out.println();
		
		result.add(IntStream.range(i, j+1).mapToObj(k->arr[k]).collect(Collectors.toList()));
	}
}
