// A majority element in an array A[] of size n is an element that appears more than n/2 times 
import java.util.*;
class Solution {
	public static void main(String ss[]) {
		int[] A = {1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4};
		// remove comments to execute
		//Solution.findMajority(A);
		Solution.findMajorityMoorVotingAlgo(A);
	}

	public static void findMajority(int[] A) {
		// 1. Sort the list
		// 2. Then traverse the list and check the corresponding values if they are same ++ the count
		// 3. then in each iteration check the count value

		int len = A.length;
		int count = 0;
		int max = -1;
		int element = -1;
		Arrays.sort(A);


		for(int i = 0; i < len - 1; i++) {
			if (count >= len / 2) {
				if (count > max)
					max = count;
			}

			if(A[i] == A[i + 1]) {
				count++;
				element = A[i];
			} else {
				count = 0;
			}
		}

		if(element != -1)
			System.out.println(element);
		else
			System.out.println("not found");
	}

	public static void findMajorityMoorVotingAlgo(int[] A) {
		int len = A.length;
		int majorIndex = 0; // consider first as a majority element
		int count = 1; // considered the first element count as 1

		for(int i = 1; i < len; i++) {
			if(A[majorIndex] == A[i])
				count++;
			else
				count--;

			if (count == 0) {
				majorIndex = i;
				count = 1;
			}
		}
		
		// As we have the returned value i.e majorIndex
		// compare and count the ouccurences.
		for(int i = 0; i < len; i++) {
			if (A[majorIndex] == A[i])
				count++;
			if (count >= len / 2) {
				System.out.println(A[majorIndex]);
				return;
			} else {
				System.out.println("Not found");
				return;
			}
		}
	}
}