package org.array;

import java.util.Arrays;

class Solution {
	  
    public static int[] twoSum(int[] nums, int target) {
        
        
        int startIndex = 0;
        int endIndex = 0;
        
        for(int i=0;i<nums.length;i++){
            
            int sum =0;
            
            for(int j=i;j<nums.length;j++){
                
                 sum+=nums[j];
                 if(sum==target && i!=j){
                    startIndex = i;
                     endIndex = j;
                     break;
                 }
            }
        }
        int[] result = {startIndex,endIndex};
        return result;
    }
    
    public static void twoSumTest(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
            	
            	int numJ = nums[j];
            	int numI = nums[i];
                if (numJ == target -numI) {
                	
                	System.out.println(i + ", "+ j);
                   // return new int[] { i, j };
                }
            }
        }
 
    }
    
    public static void main(String[] args) {
		
    	int[] arr = {3,2,3};
    	//System.out.println(Arrays.toString(twoSum(arr,6)));
    	
    	//int[] arr2 = {3,1,1,4};
    	int[] arr2 = {3,4,1,2,3,1,2,2,1,1};
    	twoSumTest(arr2,7);
    	//System.out.println(Arrays.toString(twoSumTest(arr2,7)));
    	
    	
	}
}
