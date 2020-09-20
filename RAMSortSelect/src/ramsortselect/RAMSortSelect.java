/*Evie Hilton, 
 * 9/15/20, 
 * CSCI333 Algorithms and Data Structures, 
 * RAMSortSelect, 
 * The following code implements both the Counting Sort and Randomized Quickselect algorithms. The driver
 * code which tests the algorithm methods is located in main.*/
package ramsortselect;

import java.lang.reflect.Array;
import java.util.Random;

public class RAMSortSelect<A> {

	public static void main(String[] args) {
		/*5 tests for countingSort*/
		/*5 tests for quickselect*/
		
		
		
		//A input array,B is output array, k is 1+ greatest value in array
		int A[]= {1,3,2};
		int B[]= {0,0,0};
		int k=4;

		//quickselect
		
		
	}
	//Counting Sort algorithm counts number of each value, adds them together sequentially, shifts by 1, then places each value in new array by its tally
	public void countingSort(int A[], int B[],int k) {
		//declare new array
		int C[] = new int[k+1]; 
		
		
		//initialize C array to zeroes 
		for(int i=0;i<k;i++) {
			C[i]=0;
			
		}
		//step 1 count number of times each value occurs
		for(int i=1;i<=A.length;i++) {
			 C[A[i]]++;
			 
		}
		//step 2 tally the indexes to the right
		for(int i=1;i<=k;i++) {
			C[i] = C[i] + C[i-1];

		}
		//step 3 write where each value occurs in sort by scanning through tally index
		for(int i=A.length;i>1;i--) {
			 B[C[A[i]]] = A[i];
			 C[A[i]]--;
		}
		
	}
	
	public int randomizedQuickselect(int A[],int p,int r,int i) {
		return i;
		//p to r inclusive bounds ofsubarray, order statistic i, A is input array
		/*One parameter is the input array.  A
		 * Two more parameters are the inclusive bounds of the subarray to consider. 
		 * One more parameter is i, the order statistic number to find the value of in the input array. 
		 * This method must be nondestructive, meaning it does not reorder or modify the original input array! 
		 * So, you will want to make a wrapper method to make a local copy of the input array using java.util.Arrays.copyOf, then use the local copy for everything. 
		 * You will also need to reuse the same partition method from homework 4, which you used for quicksort. */
		//base case 
		/*if(p==r) {
			return A[p];
		}
		Random rand = new Random();
		int z = rand.nextInt(p-r); //create random pivot to start
		
		//swap 
		for (int i = low; i <= high; i++) 
        { 
            // inserting elements of less value  
            // to the left of the pivot location 
            if(arr[i] < pivot) 
            { 
                int temp = arr[i]; 
                arr[i] = arr[pivotloc]; 
                arr[pivotloc] = temp; 
                pivotloc++; 
            } 
        } 
		
		return i;*/
		
		
	}

}
